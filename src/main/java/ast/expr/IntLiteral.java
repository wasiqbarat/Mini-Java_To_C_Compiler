package ast.expr;

import ast.Expression;

/** Integer literal, e.g. 42 */
public record IntLiteral(int value) implements Expression {
}
