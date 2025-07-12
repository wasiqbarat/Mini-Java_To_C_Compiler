package ast;

/** A field or local variable declaration. */
public record VarDecl(Type type, String name) implements Node {
}
