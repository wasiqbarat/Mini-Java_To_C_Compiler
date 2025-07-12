package ast.stmt;

import ast.Expression;
import ast.Statement;

/**
 * Array assignment statement: {@code id[index] = value;}
 */
public record ArrayAssignStmt(String varName, Expression index, Expression value) implements Statement {
}
