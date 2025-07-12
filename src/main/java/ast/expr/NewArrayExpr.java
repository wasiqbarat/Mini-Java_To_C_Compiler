package ast.expr;

import ast.Expression;
import ast.Type;

/**
 * Creation of a new int array: {@code new int[expr]}.
 */
public record NewArrayExpr(Type type, Expression size) implements Expression {
}
