package ast.stmt;

import ast.Expression;
import ast.Statement;

/** while (condition) body */
public record WhileStmt(Expression condition, Statement body) implements Statement {
}
