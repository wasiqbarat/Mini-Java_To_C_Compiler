package ast.stmt;

import ast.Expression;
import ast.Statement;

/**
 * A statement consisting of a single expression evaluated for its side-effects.
 * This is primarily used internally for for-loop initializers/updates that are
 * expressions rather than assignments or declarations.
 */
public record ExprStmt(Expression expr) implements Statement {
}
