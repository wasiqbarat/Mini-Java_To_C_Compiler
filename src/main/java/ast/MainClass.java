package ast;

import java.util.List;

/**
 * Represents the special entry class that defines {@code public static void main}.
 * We only store its name, the name of the command-line argument variable, and the
 * list of statements inside {@code main(...)}.
 */
public record MainClass(String name,
                        String argName,
                        List<VarDecl> locals,
                        List<Statement> statements) implements Node {
    public MainClass {
        locals = locals == null ? List.of() : List.copyOf(locals);
        statements = statements == null ? List.of() : List.copyOf(statements);
    }
}
