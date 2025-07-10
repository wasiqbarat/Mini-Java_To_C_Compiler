// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/src/Lexer/EXPR.g4 by ANTLR 4.13.2
package Lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EXPRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EXPRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EXPRParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(EXPRParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(EXPRParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(EXPRParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(EXPRParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link EXPRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(EXPRParser.IntContext ctx);
}