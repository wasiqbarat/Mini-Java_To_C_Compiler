package ast.stmt;

import ast.Expression;
import ast.Statement;

/** return expression; */
public record ReturnStmt(Expression expr) implements Statement {
}
