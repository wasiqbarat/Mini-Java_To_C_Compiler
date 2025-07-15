package ast.stmt;

import ast.Expression;
import ast.Statement;
import java.util.List;

/**
 * Desugared representation of a for-loop.
 * init   – list of expressions executed once before the loop;
 * cond   – expression checked at each iteration (may be null → true);
 * update – list of expressions executed after each iteration;
 * body   – loop body statement.
 */
public record ForStmt(List<Statement> init,
                      Expression cond,
                      List<Expression> update,
                      Statement body) implements Statement {
    public ForStmt {
        init   = init   == null ? List.of() : List.copyOf(init);
        update = update == null ? List.of() : List.copyOf(update);
    }
}
