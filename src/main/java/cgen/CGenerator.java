package cgen;

import ast.*;
import ast.expr.*;
import ast.stmt.*;

public class CGenerator {
    private final StringBuilder out = new StringBuilder();
    private int indent = 0;

    public String generate(Program program) {
        emit("#include <stdio.h>");
        emit("#include <stdlib.h>");
        emit("");
        emit("typedef struct {\n    int length;\n    int *data;\n} int_array;");
        emit("int_array* new_int_array(int size) {\n    int_array* arr = malloc(sizeof(int_array));\n    arr->length = size;\n    arr->data = calloc(size, sizeof(int));\n    return arr;\n}");
        emit("");

        for (ClassDecl c : program.classes()) {
            emit("struct " + c.name() + " {");
            indent++;
            if (c.superName() != null) {
                emit("struct " + c.superName() + " super;  // Embedding structure " + c.superName() + " within " + c.name() + " to simulate inheritance");
            }
            for (VarDecl f : c.fields()) {
                emit(mapType(f.type()) + " " + f.name() + ";");
            }
            indent--;
            emit("};");
            emit("");
        }
      
        emit("int main() {");
        indent++;
        for (Statement s : program.mainClass().statements()) {
            visitStatement(s);
        }
        emit("return 0;");
        indent--;
        emit("}");
        return out.toString();
    }

    private void visitStatement(Statement s) {
        if (s instanceof BlockStmt b) {
            emit("{");
            indent++;
            for (Statement st : b.statements()) visitStatement(st);
            indent--;
            emit("}");
        } else if (s instanceof IfStmt i) {
            emit("if (" + visitExpr(i.condition()) + ") {");
            indent++;
            visitStatement(i.thenBranch());
            indent--;
            if (i.elseBranch() != null) {
                emit("} else {");
                indent++;
                visitStatement(i.elseBranch());
                indent--;
            }
            emit("}");
        } else if (s instanceof WhileStmt w) {
            emit("while (" + visitExpr(w.condition()) + ") {");
            indent++;
            visitStatement(w.body());
            indent--;
            emit("}");
        } else if (s instanceof DoWhileStmt d) {
            emit("do {");
            indent++;
            visitStatement(d.body());
            indent--;
            emit("} while (" + visitExpr(d.condition()) + ");");
        } else if (s instanceof ForStmt f) {
            String init = joinExprs(f.init(), ", ");
            String update = joinExprs(f.update(), ", ");
            String cond = f.cond() == null ? "" : visitExpr(f.cond());
            emit("for (" + init + "; " + cond + "; " + update + ") {");
            indent++;
            visitStatement(f.body());
            indent--;
            emit("}");
        } else if (s instanceof PrintStmt p) {
            emit("printf(\"%d\\n\", " + visitExpr(p.argument()) + ");");
        } else if (s instanceof AssignStmt a) {
            emit(a.varName() + " = " + visitExpr(a.value()) + ";");
        } else if (s instanceof ArrayAssignStmt aa) {
            emit(aa.varName() + "->data[" + visitExpr(aa.index()) + "] = " + visitExpr(aa.value()) + ";");
        } else if (s instanceof BreakStmt) {
            emit("break;");
        } else if (s instanceof ContinueStmt) {
            emit("continue;");
        } else if (s instanceof EmptyStmt) {
            emit(";");
        }
    }

    private String joinExprs(java.util.List<Expression> exprs, String sep) {
        java.util.List<String> parts = new java.util.ArrayList<>();
        for (Expression e : exprs) parts.add(visitExpr(e));
        return String.join(sep + " ", parts);
    }

    private String visitExpr(Expression e) {
        if (e == null) return "0";
        if (e instanceof IntLiteral i) {
            return Integer.toString(i.value());
        }
        if (e instanceof BooleanLiteral b) {
            return b.value() ? "1" : "0";
        }
        if (e instanceof VarExpr v) {
            return v.name();
        }
        if (e instanceof BinaryExpr b) {
            return "(" + visitExpr(b.left()) + " " + b.op().symbol + " " + visitExpr(b.right()) + ")";
        }
        if (e instanceof NotExpr n) {
            return "(!" + visitExpr(n.expr()) + ")";
        }
        if (e instanceof ArrayAccessExpr aa) {
            return visitExpr(aa.array()) + "->data[" + visitExpr(aa.index()) + "]";
        }
        if (e instanceof ArrayLengthExpr al) {
            return visitExpr(al.array()) + "->length";
        }
        if (e instanceof NewArrayExpr na) {
            return "new_int_array(" + visitExpr(na.size()) + ")";
        }
        if (e instanceof NewObjectExpr no) {
            return "/* new " + no.className() + " */ 0";
        }
        if (e instanceof CallExpr c) {
            return "/* call " + c.methodName() + " */ 0";
        }
        if (e instanceof ThisExpr) {
            return "this";
        }
        // fallback
        return "0";
    }

    private void emit(String line) {
        out.append("    ".repeat(indent)).append(line).append("\n");
    }

    private String mapType(Type t) {
        if (t.isArray()) return "int_array*";
        if (t.name().equals("int")) return "int";
        if (t.name().equals("boolean")) return "int";
        // object types -> pointer to struct
        return "struct " + t.name() + "*";
    }

}
