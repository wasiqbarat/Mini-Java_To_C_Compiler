// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/src/main/antlr4/MiniJava.g4 by ANTLR 4.13.2

    package main;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MiniJavaParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MiniJavaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MiniJavaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(MiniJavaParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MiniJavaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(MiniJavaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MiniJavaParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MiniJavaParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MiniJavaParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssignStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStmt(MiniJavaParser.ArrayAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(MiniJavaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(MiniJavaParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(MiniJavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarDeclaration(MiniJavaParser.ForVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(MiniJavaParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(MiniJavaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExprList(MiniJavaParser.ForExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(MiniJavaParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#forAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAssign(MiniJavaParser.ForAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(MiniJavaParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(MiniJavaParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleMethodCallExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMethodCallExpr(MiniJavaParser.SimpleMethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(MiniJavaParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLookupExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupExpr(MiniJavaParser.ArrayLookupExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLengthExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpr(MiniJavaParser.ArrayLengthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(MiniJavaParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniJavaParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(MiniJavaParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MiniJavaParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MiniJavaParser.PrimaryContext ctx);
}