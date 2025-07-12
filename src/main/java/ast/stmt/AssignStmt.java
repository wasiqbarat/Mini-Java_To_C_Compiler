package ast.stmt;

import ast.Expression;
import ast.Statement;

/** Simple variable assignment: {@code id = value;} */
public record AssignStmt(String varName, Expression value) implements Statement {
}
