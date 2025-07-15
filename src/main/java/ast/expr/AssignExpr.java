package ast.expr;

import ast.Expression;

public record AssignExpr(String name, Expression value) implements Expression {
}
