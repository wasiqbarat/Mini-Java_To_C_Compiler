package tac;

import ast.*;
import ast.expr.*;
import ast.stmt.*;

import java.util.*;

/**
 * Very small generator that emits a textual Three Address Code (TAC)
 * representation for a subset of Mini-Java statements. The output
 * format follows the examples in docs.md and is intended for
 * demonstration purposes only.
 */
public class TacGenerator {
    private final List<String> code = new ArrayList<>();
    private int tempId = 0;
    private int labelId = 0;

    private static class LoopLabels {
        final String start;
        final String cont;
        final String end;
        LoopLabels(String s, String c, String e) { start = s; cont = c; end = e; }
    }
    private final Deque<LoopLabels> loops = new ArrayDeque<>();

    /** Generate TAC for the given program and return the instruction list. */
    public List<String> generate(Program program) {
        if (program.mainClass() != null) {
            visitMainClass(program.mainClass());
        } else {
            // no main class – still emit an empty main label to keep downstream stages happy
            emit("main:");
            emit("end_main:");
        }
        return code;
    }

    /* --------------- Statements --------------- */
    private void visitStatement(Statement s) {
        if (s instanceof BlockStmt b) {
            for (Statement st : b.statements()) visitStatement(st);
        } else if (s instanceof IfStmt i) {
            String thenL = newLabel("if_then");
            String elseL = newLabel("if_else");
            String endL  = newLabel("if_end");
            String cond = visitExpr(i.condition());
            emit("if (!" + cond + ") goto " + elseL + ";");
            emit(thenL + ":");
            visitStatement(i.thenBranch());
            emit("goto " + endL + ";");
            emit(elseL + ":");
            if (i.elseBranch() != null) visitStatement(i.elseBranch());
            emit(endL + ":");
        } else if (s instanceof WhileStmt w) {
            String start = newLabel("loop_start");
            String end   = newLabel("loop_end");
            loops.push(new LoopLabels(start, start, end));
            emit(start + ":");
            String cond = visitExpr(w.condition());
            emit("if (!" + cond + ") goto " + end + ";");
            visitStatement(w.body());
            emit("goto " + start + ";");
            emit(end + ":");
            loops.pop();
        } else if (s instanceof DoWhileStmt d) {
            String start = newLabel("do_start");
            String end   = newLabel("do_end");
            loops.push(new LoopLabels(start, start, end));
            emit(start + ":");
            visitStatement(d.body());
            String cond = visitExpr(d.condition());
            emit("if (" + cond + ") goto " + start + ";");
            emit(end + ":");
            loops.pop();
        } else if (s instanceof ForStmt f) {
            for (Expression e : f.init()) visitExpr(e);
            String start = newLabel("for_start");
            String incr  = newLabel("incr");
            String end   = newLabel("for_end");
            loops.push(new LoopLabels(start, incr, end));
            emit(start + ":");
            if (f.cond() != null) {
                String c = visitExpr(f.cond());
                emit("if (!" + c + ") goto " + end + ";");
            }
            visitStatement(f.body());
            emit(incr + ":");
            for (Expression e : f.update()) visitExpr(e);
            emit("goto " + start + ";");
            emit(end + ":");
            loops.pop();
        } else if (s instanceof PrintStmt p) {
            String v = visitExpr(p.argument());
            emit("print " + v);
        } else if (s instanceof AssignStmt a) {
            String v = visitExpr(a.value());
            emit(a.varName() + " = " + v);
        } else if (s instanceof ArrayAssignStmt aa) {
            String idx = visitExpr(aa.index());
            String val = visitExpr(aa.value());
            emit(aa.varName() + "[" + idx + "] = " + val);
        } else if (s instanceof BreakStmt) {
            if (!loops.isEmpty()) emit("goto " + loops.peek().end + ";");
        } else if (s instanceof ContinueStmt) {
            if (!loops.isEmpty()) emit("goto " + loops.peek().cont + ";");
        } else if (s instanceof EmptyStmt) {
            // nothing
        }
    }

    /* --------------- Expressions --------------- */
    private String visitExpr(Expression e) {
        if (e == null) return "0"; // defensive
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
            String l = visitExpr(b.left());
            String r = visitExpr(b.right());
            String t = newTemp();
            emit(t + " = " + l + " " + b.op().symbol + " " + r);
            return t;
        }
        if (e instanceof NotExpr n) {
            String v = visitExpr(n.expr());
            String t = newTemp();
            emit(t + " = !" + v);
            return t;
        }
        if (e instanceof ArrayAccessExpr aa) {
            String arr = visitExpr(aa.array());
            String idx = visitExpr(aa.index());
            String t = newTemp();
            emit(t + " = " + arr + "[" + idx + "]");
            return t;
        }
        if (e instanceof ArrayLengthExpr al) {
            String arr = visitExpr(al.array());
            String t = newTemp();
            emit(t + " = " + arr + ".length");
            return t;
        }
        if (e instanceof NewArrayExpr na) {
            String sz = visitExpr(na.size());
            String t = newTemp();
            emit(t + " = new int[" + sz + "]");
            return t;
        }
        if (e instanceof NewObjectExpr no) {
            String t = newTemp();
            emit(t + " = new " + no.className());
            return t;
        }
        if (e instanceof CallExpr c) {
            String recv = visitExpr(c.receiver());
            List<String> args = new ArrayList<>();
            for (Expression a : c.args()) args.add(visitExpr(a));
            String t = newTemp();
            emit(t + " = call " + recv + "." + c.methodName() + "(" + String.join(", ", args) + ")");
            return t;
        }
        if (e instanceof ThisExpr) {
            return "this";
        }
        // Fallback for unsupported expressions
        String t = newTemp();
        emit(t + " = <expr>");
        return t;
    }

    /* --------------- Helpers --------------- */
    private void visitMainClass(MainClass mc) {
        emit("main:");
        for (VarDecl v : mc.locals()) {
            if (v.init() != null) {
                String val = visitExpr(v.init());
                emit(v.name() + " = " + val);
            }
        }
        for (Statement s : mc.statements()) visitStatement(s);
        emit("end_main:");
    }

    private String newTemp() { return "t" + (tempId++); }
    private String newLabel(String base) { return base + "_" + (labelId++); }
    private void emit(String line) { code.add(line); }
}
