package ast.expr;

import ast.Expression;

/**
 * Logical negation: {@code !expr}.
 */
public record NotExpr(Expression expr) implements Expression {
}
