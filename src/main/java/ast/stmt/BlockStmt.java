package ast.stmt;

import ast.Statement;
import java.util.List;

/** { stmt* } */
public record BlockStmt(List<Statement> statements) implements Statement {
    public BlockStmt {
        statements = statements == null ? List.of() : List.copyOf(statements);
    }
}
