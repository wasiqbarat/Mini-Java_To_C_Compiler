package cli;

import ast.*;
import ast.expr.*;
import ast.stmt.*;

import java.io.PrintStream;

/**
 * A simple visitor that prints the AST to a stream in a readable, indented format.
 * This uses `instanceof` checks for dispatch, which is simple and sufficient for this project.
 */
public class AstPrinter {

    private final PrintStream out;
    private int indentLevel = 0;

    public AstPrinter(PrintStream out) {
        this.out = out;
    }

    public void print(Node node) {
        visit(node);
    }

    private void visit(Node node) {
        if (node == null) {
            println("null");
            return;
        }

        // Dispatch to the correct visit method based on the node's type
        if (node instanceof Program) visitProgram((Program) node);
        else if (node instanceof MainClass) visitMainClass((MainClass) node);
        else if (node instanceof ClassDecl) visitClassDecl((ClassDecl) node);
        else if (node instanceof MethodDecl) visitMethodDecl((MethodDecl) node);
        else if (node instanceof VarDecl) visitVarDecl((VarDecl) node);
        else if (node instanceof BlockStmt) visitBlockStmt((BlockStmt) node);
        else if (node instanceof IfStmt) visitIfStmt((IfStmt) node);
        else if (node instanceof WhileStmt) visitWhileStmt((WhileStmt) node);
        else if (node instanceof ForStmt) visitForStmt((ForStmt) node);
        else if (node instanceof DoWhileStmt) visitDoWhileStmt((DoWhileStmt) node);
        else if (node instanceof PrintStmt) visitPrintStmt((PrintStmt) node);
        else if (node instanceof AssignStmt) visitAssignStmt((AssignStmt) node);
        else if (node instanceof ArrayAssignStmt) visitArrayAssignStmt((ArrayAssignStmt) node);
        else if (node instanceof BreakStmt) visitBreakStmt((BreakStmt) node);
        else if (node instanceof ContinueStmt) visitContinueStmt((ContinueStmt) node);
        else if (node instanceof EmptyStmt) visitEmptyStmt((EmptyStmt) node);
        else if (node instanceof BinaryExpr) visitBinaryExpr((BinaryExpr) node);
        else if (node instanceof ArrayAccessExpr) visitArrayAccessExpr((ArrayAccessExpr) node);
        else if (node instanceof ArrayLengthExpr) visitArrayLengthExpr((ArrayLengthExpr) node);
        else if (node instanceof CallExpr) visitCallExpr((CallExpr) node);
        else if (node instanceof IntLiteral) visitIntLiteral((IntLiteral) node);
        else if (node instanceof BooleanLiteral) visitBooleanLiteral((BooleanLiteral) node);
        else if (node instanceof VarExpr) visitVarExpr((VarExpr) node);
        else if (node instanceof NewArrayExpr) visitNewArrayExpr((NewArrayExpr) node);
        else if (node instanceof NewObjectExpr) visitNewObjectExpr((NewObjectExpr) node);
        else if (node instanceof ThisExpr) visitThisExpr((ThisExpr) node);
        else if (node instanceof NotExpr) visitNotExpr((NotExpr) node);
        else {
            println("Unhandled node type: " + node.getClass().getSimpleName());
        }
    }

    private void visitProgram(Program node) {
        println("Program");
        indent();
        visit(node.mainClass());
        node.classes().forEach(this::visit);
        unindent();
    }

    private void visitMainClass(MainClass node) {
        println("MainClass " + node.name() + " with arg " + node.argName());
        indent();
        println("locals:");
        indent();
        node.locals().forEach(this::visit);
        unindent();
        println("body:");
        indent();
        node.statements().forEach(this::visit);
        unindent();
        unindent();
    }

    private void visitClassDecl(ClassDecl node) {
        print("ClassDecl " + node.name());
        if (node.superName() != null) {
            out.print(" extends " + node.superName());
        }
        out.println();
        indent();
        println("fields:");
        indent();
        node.fields().forEach(this::visit);
        unindent();
        println("methods:");
        indent();
        node.methods().forEach(this::visit);
        unindent();
        unindent();
    }

    private void visitMethodDecl(MethodDecl node) {
        println("MethodDecl " + node.name() + " -> " + node.returnType());
        indent();
        println("params:");
        indent();
        node.parameters().forEach(this::visit);
        unindent();
        println("locals:");
        indent();
        node.locals().forEach(this::visit);
        unindent();
        println("body:");
        indent();
        node.body().forEach(this::visit);
        unindent();
        println("returnExpr:");
        indent();
        visit(node.returnExpr());
        unindent();
        unindent();
    }

    private void visitVarDecl(VarDecl node) {
        println("VarDecl " + node.name() + " : " + node.type());
    }

    private void visitBlockStmt(BlockStmt node) {
        println("BlockStmt");
        indent();
        node.statements().forEach(this::visit);
        unindent();
    }

    private void visitIfStmt(IfStmt node) {
        println("IfStmt");
        indent();
        println("cond:");
        indent();
        visit(node.condition());
        unindent();
        println("then:");
        indent();
        visit(node.thenBranch());
        unindent();
        if (node.elseBranch() != null) {
            println("else:");
            indent();
            visit(node.elseBranch());
            unindent();
        }
        unindent();
    }

    private void visitWhileStmt(WhileStmt node) {
        println("WhileStmt");
        indent();
        println("cond:");
        indent();
        visit(node.condition());
        unindent();
        println("body:");
        indent();
        visit(node.body());
        unindent();
        unindent();
    }

    private void visitForStmt(ForStmt node) {
        println("ForStmt");
        indent();
        println("init:");
        indent();
        node.init().forEach(this::visit);
        unindent();
        println("cond:");
        indent();
        visit(node.cond());
        unindent();
        println("update:");
        indent();
        node.update().forEach(this::visit);
        unindent();
        println("body:");
        indent();
        visit(node.body());
        unindent();
        unindent();
    }

    private void visitDoWhileStmt(DoWhileStmt node) {
        println("DoWhileStmt");
        indent();
        println("body:");
        indent();
        visit(node.body());
        unindent();
        println("cond:");
        indent();
        visit(node.condition());
        unindent();
        unindent();
    }

    private void visitPrintStmt(PrintStmt node) {
        println("PrintStmt");
        indent();
        visit(node.argument());
        unindent();
    }

    private void visitAssignStmt(AssignStmt node) {
        println("AssignStmt to " + node.varName());
        indent();
        visit(node.value());
        unindent();
    }

    private void visitArrayAssignStmt(ArrayAssignStmt node) {
        println("ArrayAssignStmt to " + node.varName());
        indent();
        println("index:");
        indent();
        visit(node.index());
        unindent();
        println("value:");
        indent();
        visit(node.value());
        unindent();
        unindent();
    }

    private void visitBreakStmt(BreakStmt node) {
        println("BreakStmt");
    }

    private void visitContinueStmt(ContinueStmt node) {
        println("ContinueStmt");
    }

    private void visitEmptyStmt(EmptyStmt node) {
        println("EmptyStmt");
    }

    private void visitBinaryExpr(BinaryExpr node) {
        println("BinaryExpr " + node.op());
        indent();
        visit(node.left());
        visit(node.right());
        unindent();
    }

    private void visitArrayAccessExpr(ArrayAccessExpr node) {
        println("ArrayAccessExpr");
        indent();
        println("array:");
        indent();
        visit(node.array());
        unindent();
        println("index:");
        indent();
        visit(node.index());
        unindent();
        unindent();
    }

    private void visitArrayLengthExpr(ArrayLengthExpr node) {
        println("ArrayLengthExpr");
        indent();
        visit(node.array());
        unindent();
    }

    private void visitCallExpr(CallExpr node) {
        println("CallExpr on " + node.receiver().toString() + " method " + node.methodName());
        indent();
        println("args:");
        indent();
        node.args().forEach(this::visit);
        unindent();
        unindent();
    }

    private void visitIntLiteral(IntLiteral node) {
        println("IntLiteral " + node.value());
    }

    private void visitBooleanLiteral(BooleanLiteral node) {
        println("BooleanLiteral " + node.value());
    }

    private void visitVarExpr(VarExpr node) {
        println("VarExpr " + node.name());
    }

    private void visitNewArrayExpr(NewArrayExpr node) {
        println("NewArrayExpr of type " + node.type());
        indent();
        println("size:");
        indent();
        visit(node.size());
        unindent();
        unindent();
    }

    private void visitNewObjectExpr(NewObjectExpr node) {
        println("NewObjectExpr of class " + node.className());
    }

    private void visitThisExpr(ThisExpr node) {
        println("ThisExpr");
    }

    private void visitNotExpr(NotExpr node) {
        println("NotExpr");
        indent();
        visit(node.expr());
        unindent();
    }

    private void indent() {
        indentLevel++;
    }

    private void unindent() {
        indentLevel--;
    }

    private void print(String text) {
        out.print("  ".repeat(indentLevel) + text);
    }

    private void println(String text) {
        out.println("  ".repeat(indentLevel) + text);
    }
}
