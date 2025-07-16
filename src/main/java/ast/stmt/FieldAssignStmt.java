package ast.stmt;

import ast.Expression;
import ast.Statement;

/** Assignment to an object field: {@code receiver.field = value;} */
public record FieldAssignStmt(Expression receiver, String fieldName, Expression value) implements Statement {
}
