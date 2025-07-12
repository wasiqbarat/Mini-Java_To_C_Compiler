package ast.stmt;

import ast.Statement;

/**
 * Represents an empty statement, i.e., a single semicolon `;`.
 */
public record EmptyStmt() implements Statement {
}
