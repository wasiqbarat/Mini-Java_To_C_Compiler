package ast.expr;

import ast.Expression;

/** true or false literal */
public record BooleanLiteral(boolean value) implements Expression {
}
