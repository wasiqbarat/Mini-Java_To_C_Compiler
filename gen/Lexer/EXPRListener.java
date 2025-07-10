// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/src/Lexer/EXPR.g4 by ANTLR 4.13.2
package Lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EXPRParser}.
 */
public interface EXPRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EXPRParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EXPRParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EXPRParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EXPRParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(EXPRParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(EXPRParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(EXPRParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(EXPRParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(EXPRParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(EXPRParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(EXPRParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(EXPRParser.IntContext ctx);
}