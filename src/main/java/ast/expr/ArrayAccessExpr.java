package ast.expr;

import ast.Expression;

/** arr[index] */
public record ArrayAccessExpr(Expression array, Expression index) implements Expression {
}
