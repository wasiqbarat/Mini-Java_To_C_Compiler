package ast.stmt;

import ast.Expression;
import ast.Statement;

/** if (cond) thenBranch else elseBranch */
public record IfStmt(ast.Expression condition,
                     Statement thenBranch,
                     Statement elseBranch) implements Statement {
}
