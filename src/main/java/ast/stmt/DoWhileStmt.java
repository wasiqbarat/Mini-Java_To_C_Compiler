package ast.stmt;

import ast.Expression;
import ast.Statement;

/** do { body } while (condition); */
public record DoWhileStmt(Statement body, Expression condition) implements Statement {
}
