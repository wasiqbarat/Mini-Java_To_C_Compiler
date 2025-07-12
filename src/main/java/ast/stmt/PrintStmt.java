package ast.stmt;

import ast.Expression;
import ast.Statement;

/** System.out.println(expr); */
public record PrintStmt(Expression argument) implements Statement {
}
