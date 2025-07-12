package ast.expr;

import ast.Expression;

/** left <op> right */
public record BinaryExpr(Expression left, BinaryOp op, Expression right) implements Expression {
}
