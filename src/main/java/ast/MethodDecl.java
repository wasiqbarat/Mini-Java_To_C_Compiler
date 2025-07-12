package ast;

import java.util.List;

/**
 * A method inside a class (may also be static in main class, but we keep one node).
 */
public record MethodDecl(Type returnType,
                         String name,
                         List<VarDecl> parameters,
                         List<VarDecl> locals,
                         List<Statement> body,
                         Expression returnExpr) implements Node {

    public MethodDecl {
        parameters = parameters == null ? List.of() : List.copyOf(parameters);
        locals     = locals     == null ? List.of() : List.copyOf(locals);
        body       = body       == null ? List.of() : List.copyOf(body);
    }
}
