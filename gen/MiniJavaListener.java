// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/MiniJava.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MiniJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MiniJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(MiniJavaParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(MiniJavaParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(MiniJavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(MiniJavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#forExprList}.
	 * @param ctx the parse tree
	 */
	void enterForExprList(MiniJavaParser.ForExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#forExprList}.
	 * @param ctx the parse tree
	 */
	void exitForExprList(MiniJavaParser.ForExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MiniJavaParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MiniJavaParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(MiniJavaParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(MiniJavaParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(MiniJavaParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(MiniJavaParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLookupExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookupExpr(MiniJavaParser.ArrayLookupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLookupExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookupExpr(MiniJavaParser.ArrayLookupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLengthExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpr(MiniJavaParser.ArrayLengthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLengthExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpr(MiniJavaParser.ArrayLengthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MiniJavaParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MiniJavaParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(MiniJavaParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(MiniJavaParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MiniJavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MiniJavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MiniJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MiniJavaParser.PrimaryContext ctx);
}