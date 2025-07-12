package ir.mz.minijava.visitor;

import ir.mz.minijava.ast.*;

/**
 * Generic visitor for AST nodes (classic accept/visit pattern).
 * @param <R> return type
 * @param <P> parameter type (e.g., context)
 */
public interface AstVisitor<R, P> {
    R visit(Program node, P arg);
    R visit(ClassDecl node, P arg);
    R visit(MethodDecl node, P arg);
    R visit(VarDecl node, P arg);
    // TODO: add remaining visit methods for statements and expressions
}
