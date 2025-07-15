package ast.stmt;

import ast.Type;
import ast.Statement;
import ast.Expression;

/**
 * Statement representing a local variable declaration, optionally with an initializer.
 */
public record VarDeclStmt(Type type, String name, Expression init) implements Statement {
}
