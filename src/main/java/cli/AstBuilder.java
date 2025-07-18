package cli;

import main.MiniJavaBaseVisitor;
import main.MiniJavaParser;

import ast.*;
import ast.Program;
import ast.expr.*;
import ast.expr.FieldAccessExpr;
import ast.stmt.FieldAssignStmt;
import ast.stmt.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Very small visitor that converts the Antlr parse-tree generated by MiniJava.g4
 * into the hand-written AST classes under the {@code ast} package.
 * <p>
 * It only covers the essential constructs for the first milestones; you can
 * extend it incrementally when new grammar paths are needed.
 */
public class AstBuilder extends MiniJavaBaseVisitor<Object> {

    /* Entry ------------------------------------------------------------ */
    public Program build(MiniJavaParser.ProgramContext ctx) {
        return (Program) visit(ctx);
    }

    /* Helper: convert list of parse-tree children with the visitor */
    private <T> List<T> visitAll(List<? extends ParseTree> children, Class<T> cls) {
        List<T> out = new ArrayList<>(children.size());
        for (ParseTree c : children) out.add(cls.cast(visit(c)));
        return out;
    }

    /* program → (mainClass)? classDecl* */
     public Program visitProgram(MiniJavaParser.ProgramContext ctx) {
        MainClass main = ctx.mainClass() == null ? null : (MainClass) visit(ctx.mainClass());
        List<ClassDecl> classes = visitAll(ctx.classDeclaration(), ClassDecl.class);
        return new Program(main, classes);
    }

    /* mainClass rule */
     public MainClass visitMainClass(MiniJavaParser.MainClassContext ctx) {
        String className = ctx.Identifier(0).getText();
        String argName   = ctx.Identifier(1).getText();
        List<VarDecl> locals = visitAll(ctx.varDeclaration(), VarDecl.class);
        List<Statement> stmts = visitAll(ctx.statement(), Statement.class);
        return new MainClass(className, argName, locals, stmts);
    }

    /* classDeclaration */
     public ClassDecl visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String name = ctx.Identifier(0).getText();
        String superName = ctx.EXTENDS() != null ? ctx.Identifier(1).getText() : null;
        List<VarDecl> fields = visitAll(ctx.varDeclaration(), VarDecl.class);
        List<ConstructorDecl> ctors = visitAll(ctx.constructorDeclaration(), ConstructorDecl.class);
        List<MethodDecl> methods = visitAll(ctx.methodDeclaration(), MethodDecl.class);
        return new ClassDecl(name, superName, fields, ctors, methods);
    }

    /* varDeclaration */
     public VarDecl visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        Type t = (Type) visit(ctx.type());
        String name = ctx.Identifier().getText();
        Expression init = ctx.expression() == null ? null : (Expression) visit(ctx.expression());
        return new VarDecl(t, name, init);
    }

    /* forVarDeclaration (used inside for-loop init) */
     public VarDecl visitForVarDeclaration(MiniJavaParser.ForVarDeclarationContext ctx) {
        Type t = (Type) visit(ctx.type());
        String name = ctx.Identifier().getText();
        Expression init = ctx.expression() == null ? null : (Expression) visit(ctx.expression());
        return new VarDecl(t, name, init);
    }

    /* methodDeclaration */
     public MethodDecl visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        Type returnType;
        if (ctx.type() != null) {
            returnType = (Type) visit(ctx.type());
        } else { // void
            returnType = new Type("void", false);
        }
        String name = ctx.Identifier().getText();

        // Manually build the parameter list from the formalParameters context
        List<VarDecl> params = new ArrayList<>();
        if (ctx.formalParameters() != null) {
            MiniJavaParser.FormalParametersContext paramsCtx = ctx.formalParameters();
            for (int i = 0; i < paramsCtx.type().size(); i++) {
                Type paramType = (Type) visit(paramsCtx.type(i));
                String paramName = paramsCtx.Identifier(i).getText();
                params.add(new VarDecl(paramType, paramName, null));
            }
        }

        List<VarDecl> locals = visitAll(ctx.varDeclaration(), VarDecl.class);
        List<Statement> body = visitAll(ctx.statement(), Statement.class);
        Expression retExpr = ctx.expression() == null ? null : (Expression) visit(ctx.expression());

        return new MethodDecl(returnType, name, params, locals, body, retExpr);
    }

    
    /* constructorDeclaration */
    public ConstructorDecl visitConstructorDeclaration(MiniJavaParser.ConstructorDeclarationContext ctx) {
        String name = ctx.Identifier().getText();

        // parameters
        List<VarDecl> params = new ArrayList<>();
        if (ctx.formalParameters() != null) {
            MiniJavaParser.FormalParametersContext paramsCtx = ctx.formalParameters();
            for (int i = 0; i < paramsCtx.type().size(); i++) {
                Type paramType = (Type) visit(paramsCtx.type(i));
                String paramName = paramsCtx.Identifier(i).getText();
                params.add(new VarDecl(paramType, paramName, null));
            }
        }

        List<VarDecl> locals = visitAll(ctx.varDeclaration(), VarDecl.class);
        List<Statement> body = visitAll(ctx.statement(), Statement.class);
        return new ConstructorDecl(name, params, locals, body);
    }


    /* type */
     public Type visitType(MiniJavaParser.TypeContext ctx) {
        if (ctx.INT() != null && ctx.LBRACK() != null) return Type.INT_ARR;
        if (ctx.INT() != null) return Type.INT;
        if (ctx.BOOLEAN() != null) return Type.BOOLEAN;
        // otherwise it is class identifier
        return new Type(ctx.Identifier().getText(), false);
    }

    /* ------------------------- statements --------------------------- */
    public Statement visitFieldAssignStmt(main.MiniJavaParser.FieldAssignStmtContext ctx) {
        Expression recv = (Expression) visit(ctx.expression(0));
        String field = ctx.Identifier().getText();
        Expression val = (Expression) visit(ctx.expression(1));
        return new FieldAssignStmt(recv, field, val);
    }
     public Statement visitBlockStmt(MiniJavaParser.BlockStmtContext ctx) {
        List<Statement> stmts = visitAll(ctx.statement(), Statement.class);
        return new BlockStmt(stmts);
    }

     public Statement visitIfStmt(MiniJavaParser.IfStmtContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        Statement thenB = (Statement) visit(ctx.statement(0));
        Statement elseB = ctx.statement().size() > 1
                          ? (Statement) visit(ctx.statement(1))
                          : null;        
        return new IfStmt(cond, thenB, elseB);
    }

     public Statement visitWhileStmt(MiniJavaParser.WhileStmtContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        Statement body = (Statement) visit(ctx.statement());
        return new WhileStmt(cond, body);
    }

     public Statement visitDoWhileStmt(MiniJavaParser.DoWhileStmtContext ctx) {
        Statement body = (Statement) visit(ctx.statement());
        Expression cond = (Expression) visit(ctx.expression());
        return new DoWhileStmt(body, cond);
    }

     public Statement visitPrintStmt(MiniJavaParser.PrintStmtContext ctx) {
        Expression arg = (Expression) visit(ctx.expression());
        return new PrintStmt(arg);
    }

     public Statement visitBreakStmt(MiniJavaParser.BreakStmtContext ctx) {
        return new BreakStmt();
    }

     public Statement visitContinueStmt(MiniJavaParser.ContinueStmtContext ctx) {
        return new ContinueStmt();
    }

     public Statement visitAssignStmt(MiniJavaParser.AssignStmtContext ctx) {
        String name = ctx.Identifier().getText();
        Expression val = (Expression) visit(ctx.expression());
        return new AssignStmt(name, val);
    }
    
    /* array assignment: id[index] = value; */
    public Statement visitArrayAssignStmt(MiniJavaParser.ArrayAssignStmtContext ctx) {
        String var = ctx.Identifier().getText();
        Expression index = (Expression) visit(ctx.expression(0));
        Expression value = (Expression) visit(ctx.expression(1));
        return new ArrayAssignStmt(var, index, value);
    }


     public Statement visitReturnStmt(MiniJavaParser.ReturnStmtContext ctx) {
        Expression val = (Expression) visit(ctx.expression());
        return new ReturnStmt(val);
    }

    /* for-loop desugaring */
     public Statement visitForStmt(MiniJavaParser.ForStmtContext ctx) {
        // The init and update parts of a for-loop are lists of expressions.
        // The grammar nests them under forExprList, so we need to go one level deeper.
        // Build init list – it can be either expressions or a single var declaration
        List<Statement> initStmts = new ArrayList<>();
        if (ctx.forInit() != null) {
            if (ctx.forInit().forExprList() != null) {
                for (MiniJavaParser.ForExprContext ectx : ctx.forInit().forExprList().forExpr()) {
                    Expression e = (Expression) visit(ectx);
                    initStmts.add(new ExprStmt(e));
                }
            } else if (ctx.forInit().forVarDeclaration() != null) {
                // Build whatever the visitor returns. If it's a VarDecl, wrap as VarDeclStmt.
                Object tmp = visit(ctx.forInit().forVarDeclaration());
                if (tmp instanceof VarDecl decl) {
                    initStmts.add(new VarDeclStmt(decl.type(), decl.name(), decl.init()));
                } else if (tmp instanceof Expression expr) {
                    // fall-back – treat it like an expression statement so we stay safe
                    initStmts.add(new ExprStmt(expr));
                }
            }
        }

        Expression cond = ctx.forCondition() == null ? null : (Expression) visit(ctx.forCondition().expression());

        List<Expression> updateExprs = ctx.forUpdate() == null ? List.of() : visitAll(ctx.forUpdate().forExprList().forExpr(), Expression.class);

        Statement body = (Statement) visit(ctx.statement());
        return new ForStmt(initStmts, cond, updateExprs, body);
    }

     public Expression visitForExpr(MiniJavaParser.ForExprContext ctx) {
        if (ctx.expression() != null) {
            return (Expression) visit(ctx.expression());
        }
        return (Expression) visit(ctx.forAssign());
    }

     public AssignExpr visitForAssign(MiniJavaParser.ForAssignContext ctx) {
        String name = ctx.Identifier().getText();
        Expression value = (Expression) visit(ctx.expression());
        return new AssignExpr(name, value);
    }

    /* ------------------------- expressions -------------------------- */
     public Expression visitPrimaryExpr(MiniJavaParser.PrimaryExprContext ctx) {
        return (Expression) visit(ctx.primary());
    }

     public Expression visitPrimary(MiniJavaParser.PrimaryContext ctx) {
        // Literals and identifiers
        if (ctx.IntegerLiteral() != null) return new IntLiteral(Integer.parseInt(ctx.IntegerLiteral().getText()));
        if (ctx.TRUE() != null)  return new BooleanLiteral(true);
        if (ctx.THIS() != null) return new ThisExpr();

         // Creation expressions: new int[expr] | new Identifier()
         if (ctx.getChildCount() >= 2 && "new".equals(ctx.getChild(0).getText())) {
             if (ctx.INT() != null) { // new int[ size ]
                 Expression size = (Expression) visit(ctx.expression());
                 return new NewArrayExpr(Type.INT_ARR, size);
             } else { // new ClassName()
                 String className = ctx.Identifier().getText();
                 return new NewObjectExpr(className);
             }
         }

         // Parenthesised expression
         if (ctx.LPAREN() != null) {
             return (Expression) visit(ctx.expression());
         }
         // Variable reference after other checks (must be last)
        if (ctx.FALSE() != null) return new BooleanLiteral(false);
        if (ctx.Identifier() != null) return new VarExpr(ctx.Identifier().getText());
        
        // Unary operators handled via child count == 2 (prefix '-' or '!')
        if (ctx.getChildCount() == 2) {
            String op = ctx.getChild(0).getText();
            Expression inner = (Expression) visit(ctx.expression());
            if ("-".equals(op)) {
                return new BinaryExpr(new IntLiteral(0), BinaryOp.SUB, inner);
            } else if ("!".equals(op)) {
                return new NotExpr(inner);
            }
        }

        // Fallback for unimplemented primaries (this, new, etc.)
        return new VarExpr("<unsupported-primary>");
    }

     public Expression visitAddSubExpr(MiniJavaParser.AddSubExprContext ctx) {
        Expression l = (Expression) visit(ctx.expression(0));
        Expression r = (Expression) visit(ctx.expression(1));
        BinaryOp op = ctx.bop.getText().equals("+") ? BinaryOp.ADD : BinaryOp.SUB;
        return new BinaryExpr(l, op, r);
    }

     public Expression visitMulDivExpr(MiniJavaParser.MulDivExprContext ctx) {
        Expression l = (Expression) visit(ctx.expression(0));
        Expression r = (Expression) visit(ctx.expression(1));
        String sym = ctx.bop.getText();
        BinaryOp op = switch (sym) {
            case "*" -> BinaryOp.MUL;
            case "/" -> BinaryOp.DIV;
            default   -> BinaryOp.MOD;
        };
        return new BinaryExpr(l, op, r);
    }

     public Expression visitRelExpr(MiniJavaParser.RelExprContext ctx) {
        Expression l = (Expression) visit(ctx.expression(0));
        Expression r = (Expression) visit(ctx.expression(1));
        BinaryOp op = switch (ctx.bop.getText()) {
            case "<"  -> BinaryOp.LT;
            case "<=" -> BinaryOp.LTE;
            case ">"  -> BinaryOp.GT;
            case ">=" -> BinaryOp.GTE;
            case "==" -> BinaryOp.EQ;
            default    -> BinaryOp.NEQ;
        };
        return new BinaryExpr(l, op, r);
    }

     public Expression visitAndExpr(MiniJavaParser.AndExprContext ctx) {
        Expression l = (Expression) visit(ctx.expression(0));
        Expression r = (Expression) visit(ctx.expression(1));
        return new BinaryExpr(l, BinaryOp.AND, r);
    }

     public Expression visitOrExpr(MiniJavaParser.OrExprContext ctx) {
        Expression l = (Expression) visit(ctx.expression(0));
        Expression r = (Expression) visit(ctx.expression(1));
        return new BinaryExpr(l, BinaryOp.OR, r);
    }

    /* -------------- array & method-call expressions --------------- */
    public Expression visitFieldAccessExpr(main.MiniJavaParser.FieldAccessExprContext ctx) {
        Expression recv = (Expression) visit(ctx.expression());
        String field = ctx.Identifier().getText();
        return new FieldAccessExpr(recv, field);
    }

    /* -------------- array & method-call expressions --------------- */
     public Expression visitArrayLookupExpr(MiniJavaParser.ArrayLookupExprContext ctx) {
         Expression array = (Expression) visit(ctx.expression(0));
         Expression index = (Expression) visit(ctx.expression(1));
         return new ArrayAccessExpr(array, index);
     }

     public Expression visitArrayLengthExpr(MiniJavaParser.ArrayLengthExprContext ctx) {
         Expression array = (Expression) visit(ctx.expression());
         return new ArrayLengthExpr(array);
     }

     public Expression visitMethodCallExpr(MiniJavaParser.MethodCallExprContext ctx) {
         Expression recv = (Expression) visit(ctx.expression());
         List<Expression> args = ctx.argumentList() == null ? List.of()
                 : visitAll(ctx.argumentList().expression(), Expression.class);
         String name = ctx.Identifier().getText();
         return new CallExpr(recv, name, args);   
     }

     public Expression visitSimpleMethodCallExpr(MiniJavaParser.SimpleMethodCallExprContext ctx) {
        Expression recv = new ThisExpr();
        java.util.List<Expression> args = ctx.argumentList() == null ? java.util.List.of()
                : visitAll(ctx.argumentList().expression(), Expression.class);
        String name = ctx.Identifier().getText();
        return new CallExpr(recv, name, args);
    }

    /* Default fall-through */
     protected Object defaultResult() { return null; }
}
