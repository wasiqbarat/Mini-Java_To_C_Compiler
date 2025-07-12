package ast;

import java.util.List;

/**
 * A standard class declaration: its name, an optional parent class, fields, and methods.
 */
public record ClassDecl(String name,
                        String superName,
                        List<VarDecl> fields,
                        List<MethodDecl> methods) implements Node {

    public ClassDecl {
        fields  = fields  == null ? List.of() : List.copyOf(fields);
        methods = methods == null ? List.of() : List.copyOf(methods);
    }
}
