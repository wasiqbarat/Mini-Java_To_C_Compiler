package ast.expr;

import ast.Expression;

/**
 * Array length expression: {@code array.length}.
 */
public record ArrayLengthExpr(Expression array) implements Expression {
}
