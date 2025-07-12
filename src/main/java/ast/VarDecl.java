package ast;

import ast.Expression;

/** A field or local variable declaration with optional initializer. */
public record VarDecl(Type type, String name, Expression init) implements Node {
}
