package ast.expr;

import ast.Expression;

/** Field access expression like {@code receiver.field}. */
public record FieldAccessExpr(Expression receiver, String fieldName) implements Expression {
}
