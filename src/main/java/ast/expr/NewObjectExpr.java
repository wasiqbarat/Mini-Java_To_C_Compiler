package ast.expr;

import ast.Expression;

/**
 * Creation of a new object: {@code new ClassName()}.
 */
public record NewObjectExpr(String className) implements Expression {
}
