package ast.expr;

import ast.Expression;

/** A reference to a local/field/parameter variable by name */
public record VarExpr(String name) implements Expression {
}
