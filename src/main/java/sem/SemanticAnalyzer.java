package sem;

import ast.*;
import ast.expr.*;
import ast.stmt.*;

import java.util.*;

/** Performs semantic analysis on the AST. */
public class SemanticAnalyzer {

    /** Analyze a program and throw SemanticException on error. */
    public void analyze(Program program) {
        Map<String, ClassInfo> classes = new LinkedHashMap<>();
        if (program.mainClass() != null) {
            String mainName = program.mainClass().name();
            classes.put(mainName, new ClassInfo(mainName, null));
        }
        for (ClassDecl cd : program.classes()) {
            if (classes.containsKey(cd.name())) {
                throw new SemanticException("Duplicate class: " + cd.name());
            }
            classes.put(cd.name(), new ClassInfo(cd.name(), cd.superName()));
        }
        for (ClassInfo ci : classes.values()) {
            detectCycle(ci, classes, new HashSet<>());
        }
        for (ClassDecl cd : program.classes()) {
            ClassInfo ci = classes.get(cd.name());
            // ---- collect fields ----
            for (VarDecl f : cd.fields()) {
                if (ci.fields.putIfAbsent(f.name(), f) != null) {
                    throw new SemanticException("Duplicate field " + f.name() + " in class " + cd.name());
                }
            }
            // ---- collect methods (allow overloading) ----
            for (MethodDecl m : cd.methods()) {
                // Fetch or create the overload list for this method name
                var list = ci.methods.computeIfAbsent(m.name(), k -> new ArrayList<>());
                // Check for an existing overload with identical parameter types (exact same signature)
                boolean dup = list.stream().anyMatch(existing -> sameSignature(existing, m));
                if (dup) {
                    throw new SemanticException("Duplicate method " + m.name() + " in class " + cd.name());
                }
                list.add(m);
            }
        }
        for (ClassDecl cd : program.classes()) {
            analyzeClass(cd, classes);
        }
        if (program.mainClass() != null) {
            analyzeMain(program.mainClass(), classes);
        }
    }

    /* ------------ main method analysis ------------ */
    private void analyzeMain(MainClass main, Map<String, ClassInfo> classes) {
        Deque<Map<String, Type>> scopes = new ArrayDeque<>();
        pushScope(scopes);
        scopes.peek().put(main.argName(), new Type("String", true));
        pushScope(scopes);
        for (VarDecl v : main.locals()) {
            declareVar(scopes, v);
            if (v.init() != null) {
                Type val = typeOf(v.init(), scopes, classes, null);
                if (!isAssignable(val, v.type(), classes)) {
                    throw new SemanticException("Cannot assign " + val + " to variable " + v.name());
                }
            }
        }
        analyzeStatements(main.statements(), scopes, classes, null, new Type("void", false));
        popScope(scopes);
        popScope(scopes);
    }

    private void analyzeClass(ClassDecl cd, Map<String, ClassInfo> classes) {
        for (MethodDecl m : cd.methods()) {
            analyzeMethod(cd, m, classes);
        }
    }

    private void analyzeMethod(ClassDecl owner, MethodDecl md, Map<String, ClassInfo> classes) {
        Deque<Map<String, Type>> scopes = new ArrayDeque<>();
        pushScope(scopes);
        for (VarDecl p : md.parameters()) {
            declareVar(scopes, p);
        }
        pushScope(scopes);
        for (VarDecl v : md.locals()) {
            declareVar(scopes, v);
            if (v.init() != null) {
                Type val = typeOf(v.init(), scopes, classes, owner);
                if (!isAssignable(val, v.type(), classes)) {
                    throw new SemanticException("Cannot assign " + val + " to variable " + v.name());
                }
            }
        }
        analyzeStatements(md.body(), scopes, classes, owner, md.returnType());
        // Check optional trailing 'return <expr>;' that appears after the statement list
        if (md.returnExpr() != null) {
            if (md.returnType().name().equals("void")) {
                throw new SemanticException("Cannot return a value from a void method");
            }
            Type ret = typeOf(md.returnExpr(), scopes, classes, owner);
            if (!isAssignable(ret, md.returnType(), classes)) {
                throw new SemanticException("Return type mismatch in method " + md.name());
            }
        }
        popScope(scopes);
        popScope(scopes);
    }

    private void analyzeStatements(List<Statement> stmts, Deque<Map<String, Type>> scopes,
                                   Map<String, ClassInfo> classes, ClassDecl currentClass,
                                   Type expectedReturnType) {
        int loopDepth = 0;
        for (Statement s : stmts) {
            loopDepth = analyzeStatement(s, scopes, classes, currentClass, loopDepth, expectedReturnType);
        }
    }

    private int analyzeStatement(Statement stmt, Deque<Map<String, Type>> scopes,
                                 Map<String, ClassInfo> classes, ClassDecl currentClass,
                                 int loopDepth,
                                 Type expectedReturnType) {
        if (stmt instanceof BlockStmt b) {
            pushScope(scopes);
            for (Statement s : b.statements()) {
                loopDepth = analyzeStatement(s, scopes, classes, currentClass, loopDepth, expectedReturnType);
            }
            popScope(scopes);
        } else if (stmt instanceof IfStmt i) {
            Type cond = typeOf(i.condition(), scopes, classes, currentClass);
            expect(cond, Type.BOOLEAN, "if condition must be boolean");
            loopDepth = analyzeStatement(i.thenBranch(), scopes, classes, currentClass, loopDepth, expectedReturnType);
            if (i.elseBranch() != null) {
                loopDepth = analyzeStatement(i.elseBranch(), scopes, classes, currentClass, loopDepth, expectedReturnType);
            }
        } else if (stmt instanceof WhileStmt w) {
            Type cond = typeOf(w.condition(), scopes, classes, currentClass);
            expect(cond, Type.BOOLEAN, "while condition must be boolean");
            loopDepth++;
            loopDepth = analyzeStatement(w.body(), scopes, classes, currentClass, loopDepth, expectedReturnType);
            loopDepth--;
        } else if (stmt instanceof DoWhileStmt d) {
            loopDepth++;
            loopDepth = analyzeStatement(d.body(), scopes, classes, currentClass, loopDepth, expectedReturnType);
            loopDepth--;
            Type cond = typeOf(d.condition(), scopes, classes, currentClass);
            expect(cond, Type.BOOLEAN, "do-while condition must be boolean");
        } else if (stmt instanceof ForStmt f) {
            pushScope(scopes);
            for (Statement initS : f.init()) {
                if (initS instanceof VarDeclStmt vd) {
                    // declare variable in current scope
                    declareVar(scopes, new VarDecl(vd.type(), vd.name(), null));
                    if (vd.init() != null) {
                        Type val = typeOf(vd.init(), scopes, classes, currentClass);
                        if (!isAssignable(val, vd.type(), classes)) {
                            throw new SemanticException("Cannot assign " + val + " to variable " + vd.name());
                        }
                    }
                } else if (initS instanceof ExprStmt es) {
                    typeOf(es.expr(), scopes, classes, currentClass);
                }
            }
            if (f.cond() != null) {
                Type cond = typeOf(f.cond(), scopes, classes, currentClass);
                expect(cond, Type.BOOLEAN, "for condition must be boolean");
            }
            loopDepth++;
            loopDepth = analyzeStatement(f.body(), scopes, classes, currentClass, loopDepth, expectedReturnType);
            loopDepth--;
            for (Expression e : f.update()) {
                typeOf(e, scopes, classes, currentClass);
            }
            popScope(scopes);
        } else if (stmt instanceof PrintStmt p) {
            Type t = typeOf(p.argument(), scopes, classes, currentClass);
            if (!t.equals(Type.INT) && !t.equals(Type.BOOLEAN)) {
                throw new SemanticException("System.out.println expects int or boolean");
            }
        } else if (stmt instanceof FieldAssignStmt fa) {
            Type recvT = typeOf(fa.receiver(), scopes, classes, currentClass);
            ClassInfo ci = classes.get(recvT.name());
            if (ci == null) throw new SemanticException("Unknown class " + recvT.name());
            VarDecl f = null;
            ClassInfo walk = ci;
            while (walk != null && f == null) {
                f = walk.fields.get(fa.fieldName());
                walk = classes.get(walk.superName);
            }
            if (f == null) throw new SemanticException("Unknown field " + fa.fieldName());
            Type valT = typeOf(fa.value(), scopes, classes, currentClass);
            if (!isAssignable(valT, f.type(), classes)) {
                throw new SemanticException("Cannot assign " + valT + " to field " + fa.fieldName());
            }
        } else if (stmt instanceof AssignStmt a) {
            Type var = lookupVar(a.varName(), scopes, classes, currentClass);
            Type val = typeOf(a.value(), scopes, classes, currentClass);
            if (!isAssignable(val, var, classes)) {
                throw new SemanticException("Cannot assign " + val + " to variable " + a.varName());
            }
        } else if (stmt instanceof ArrayAssignStmt aa) {
            Type arr = lookupVar(aa.varName(), scopes, classes, currentClass);
            if (!arr.isArray()) {
                throw new SemanticException("Variable " + aa.varName() + " is not an array");
            }
            Type idx = typeOf(aa.index(), scopes, classes, currentClass);
            expect(idx, Type.INT, "Array index must be int");
            Type val = typeOf(aa.value(), scopes, classes, currentClass);
            Type elem = new Type(arr.name(), false);
            if (!isAssignable(val, elem, classes)) {
                throw new SemanticException("Array assignment type mismatch");
            }
        } else if (stmt instanceof ReturnStmt r) {
            // Validate return statement against expected method return type
            if (expectedReturnType.name().equals("void")) {
                if (r.expr() != null) {
                    throw new SemanticException("Cannot return a value from a void method");
                }
            } else {
                if (r.expr() == null) {
                    throw new SemanticException("Missing return value in return statement");
                }
                Type retType = typeOf(r.expr(), scopes, classes, currentClass);
                if (!isAssignable(retType, expectedReturnType, classes)) {
                    throw new SemanticException("Return type mismatch: expected " + expectedReturnType + " but found " + retType);
                }
            }
        } else if (stmt instanceof BreakStmt) {
            if (loopDepth == 0) {
                throw new SemanticException("break used outside of loop");
            }
        } else if (stmt instanceof ContinueStmt) {
            if (loopDepth == 0) {
                throw new SemanticException("continue used outside of loop");
            }
        }
        return loopDepth;
    }

    /* ------------ expression typing ------------ */
    private Type typeOf(Expression expr, Deque<Map<String, Type>> scopes,
                         Map<String, ClassInfo> classes, ClassDecl currentClass) {

        // ---------- literals ----------
        if (expr instanceof IntLiteral) return Type.INT;
        if (expr instanceof BooleanLiteral) return Type.BOOLEAN;

        // ---------- simple references ----------
        if (expr instanceof FieldAccessExpr fa) {
            Type recvT = typeOf(fa.receiver(), scopes, classes, currentClass);
            ClassInfo ci = classes.get(recvT.name());
            if (ci == null) {
                throw new SemanticException("Unknown class " + recvT.name());
            }
            VarDecl f = null;
            ClassInfo walk = ci;
            while (walk != null && f == null) {
                f = walk.fields.get(fa.fieldName());
                walk = classes.get(walk.superName);
            }
            if (f == null) {
                throw new SemanticException("Unknown field " + fa.fieldName() + " in class " + recvT.name());
            }
            return f.type();
        }

        if (expr instanceof VarExpr v) {
            return lookupVar(v.name(), scopes, classes, currentClass);
        }
        if (expr instanceof ThisExpr) {
            if (currentClass == null) {
                throw new SemanticException("this used outside of a class method");
            }
            return new Type(currentClass.name(), false);
        }

        // ---------- unary ----------
        if (expr instanceof NotExpr n) {
            Type t = typeOf(n.expr(), scopes, classes, currentClass);
            expect(t, Type.BOOLEAN, "! expects boolean");
            return Type.BOOLEAN;
        }

        // ---------- binary ----------
        if (expr instanceof BinaryExpr b) {
            Type l = typeOf(b.left(), scopes, classes, currentClass);
            Type r = typeOf(b.right(), scopes, classes, currentClass);
            return switch (b.op()) {
                case ADD, SUB, MUL, DIV, MOD -> {
                    expect(l, Type.INT, "Left operand must be int");
                    expect(r, Type.INT, "Right operand must be int");
                    yield Type.INT;
                }
                case AND, OR -> {
                    expect(l, Type.BOOLEAN, "Left operand must be boolean");
                    expect(r, Type.BOOLEAN, "Right operand must be boolean");
                    yield Type.BOOLEAN;
                }
                case LT, LTE, GT, GTE -> {
                    expect(l, Type.INT, "Left operand must be int");
                    expect(r, Type.INT, "Right operand must be int");
                    yield Type.BOOLEAN;
                }
                case EQ, NEQ -> {
                    if (!l.equals(r)) {
                        throw new SemanticException("Operands must have same type for ==/!=");
                    }
                    yield Type.BOOLEAN;
                }
            };
        }

        // ---------- array access ----------
        if (expr instanceof ArrayAccessExpr a) {
            Type arr = typeOf(a.array(), scopes, classes, currentClass);
            if (!arr.isArray()) {
                throw new SemanticException("Not an array");
            }
            Type idx = typeOf(a.index(), scopes, classes, currentClass);
            expect(idx, Type.INT, "Array index must be int");
            return new Type(arr.name(), false);
        }

        // ---------- array length ----------
        if (expr instanceof ArrayLengthExpr al) {
            Type arr = typeOf(al.array(), scopes, classes, currentClass);
            if (!arr.isArray()) {
                throw new SemanticException(".length applied to non-array");
            }
            return Type.INT;
        }

        // ---------- creation ----------
        if (expr instanceof NewArrayExpr na) {
            Type sizeT = typeOf(na.size(), scopes, classes, currentClass);
            expect(sizeT, Type.INT, "Array size must be int");
            return na.type();
        }
        if (expr instanceof NewObjectExpr no) {
            if (!classes.containsKey(no.className())) {
                throw new SemanticException("Unknown class " + no.className());
            }
            return new Type(no.className(), false);
        }

        // ---------- assignment expr ----------
        if (expr instanceof AssignExpr assign) {
            Type varType = lookupVar(assign.name(), scopes, classes, currentClass);
            Type valType = typeOf(assign.value(), scopes, classes, currentClass);
            if (!isAssignable(valType, varType, classes)) {
                throw new SemanticException("Cannot assign " + valType + " to variable " + assign.name());
            }
            return varType;
        }

        // ---------- method call ----------
        if (expr instanceof CallExpr call) {
            Type recv = typeOf(call.receiver(), scopes, classes, currentClass);
            ClassInfo ci = classes.get(recv.name());
            if (ci == null) {
                throw new SemanticException("Unknown class " + recv.name());
            }
            // Collect argument types first
            java.util.List<Type> argTypes = new java.util.ArrayList<>();
            for (Expression argExpr : call.args()) {
                argTypes.add(typeOf(argExpr, scopes, classes, currentClass));
            }
            MethodDecl md = lookupMethod(ci, call.methodName(), argTypes, classes);
            if (md == null) {
                throw new SemanticException("No matching overload for method " + call.methodName() + " in class " + recv.name());
            }
            // Validate assignment compatibility (already done in lookup, but we repeat for clarity)
            for (int i = 0; i < argTypes.size(); i++) {
                if (!isAssignable(argTypes.get(i), md.parameters().get(i).type(), classes)) {
                    throw new SemanticException("Argument type mismatch in call to " + call.methodName());
                }
            }
            return md.returnType();
        }

        // Should never reach here
        return Type.INT;
    }

     /* ------------ helpers ------------ */
    private void pushScope(Deque<Map<String, Type>> scopes) { scopes.push(new HashMap<>()); }
    private void popScope(Deque<Map<String, Type>> scopes) { scopes.pop(); }

    private void declareVar(Deque<Map<String, Type>> scopes, VarDecl v) {
        Map<String, Type> top = scopes.peek();
        if (top.containsKey(v.name())) {
            throw new SemanticException("Variable " + v.name() + " already declared in this scope");
        }
        top.put(v.name(), v.type());
    }

    private Type lookupVar(String name, Deque<Map<String, Type>> scopes,
                           Map<String, ClassInfo> classes, ClassDecl currentClass) {
        for (Map<String, Type> s : scopes) {
            if (s.containsKey(name)) return s.get(name);
        }
        if (currentClass != null) {
            ClassInfo ci = classes.get(currentClass.name());
            while (ci != null) {
                VarDecl f = ci.fields.get(name);
                if (f != null) return f.type();
                ci = classes.get(ci.superName);
            }
        }
        throw new SemanticException("Undefined variable " + name);
    }

    private void expect(Type actual, Type expected, String msg) {
        if (!actual.equals(expected)) {
            throw new SemanticException(msg);
        }
    }

    private boolean isAssignable(Type from, Type to, Map<String, ClassInfo> classes) {
        if (from.equals(to)) return true;
        if (!from.isArray() && !to.isArray()) {
            ClassInfo ci = classes.get(from.name());
            while (ci != null) {
                if (ci.name.equals(to.name())) return true;
                ci = classes.get(ci.superName);
            }
        }
        return false;
    }

    private MethodDecl lookupMethod(ClassInfo ci, String name, java.util.List<Type> argTypes, Map<String, ClassInfo> classes) {
        // Walk the inheritance chain
        while (ci != null) {
            java.util.List<MethodDecl> candidates = ci.methods.get(name);
            if (candidates != null) {
                // Try to find an exact match on parameter count and assignable types
                for (MethodDecl m : candidates) {
                    if (m.parameters().size() != argTypes.size()) continue;
                    boolean ok = true;
                    for (int i = 0; i < argTypes.size(); i++) {
                        if (!isAssignable(argTypes.get(i), m.parameters().get(i).type(), classes)) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) return m;
                }
            }
            ci = classes.get(ci.superName);
        }
        return null;
    }

    private void detectCycle(ClassInfo ci, Map<String, ClassInfo> classes, Set<String> seen) {
        if (ci.superName == null) return;
        if (!classes.containsKey(ci.superName)) return;
        if (!seen.add(ci.name)) {
            throw new SemanticException("Cyclic inheritance involving " + ci.name);
        }
        detectCycle(classes.get(ci.superName), classes, seen);
        seen.remove(ci.name);
    }

    private boolean sameSignature(MethodDecl a, MethodDecl b) {
        if (a.parameters().size() != b.parameters().size()) return false;
        for (int i = 0; i < a.parameters().size(); i++) {
            if (!a.parameters().get(i).type().equals(b.parameters().get(i).type())) return false;
        }
        return true;
    }

    private static class ClassInfo {
        final String name;
        final String superName;
        final Map<String, VarDecl> fields = new HashMap<>();
        // Support method overloading: list of methods per name
        final Map<String, java.util.List<MethodDecl>> methods = new HashMap<>();
        ClassInfo(String n, String s) { name = n; superName = s; }
    }
}
