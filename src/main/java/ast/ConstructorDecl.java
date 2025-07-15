package ast;

import java.util.List;

/** A public constructor declaration inside a class. */
public record ConstructorDecl(String name,
                              List<VarDecl> parameters,
                              List<VarDecl> locals,
                              List<Statement> body) implements Node {
    public ConstructorDecl {
        parameters = parameters == null ? List.of() : List.copyOf(parameters);
        locals = locals == null ? List.of() : List.copyOf(locals);
        body = body == null ? List.of() : List.copyOf(body);
    }
}