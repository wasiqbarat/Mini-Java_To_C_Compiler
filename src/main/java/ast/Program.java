package ast;

import java.util.List;

/**
 * Root of the AST representing an entire Mini-Java compilation unit.
 */
public record Program(MainClass mainClass, List<ClassDecl> classes) implements Node {
    public Program {
        // ensure list is never null to avoid NPEs in toy pipelines
        classes = classes == null ? List.of() : List.copyOf(classes);
    }
}
