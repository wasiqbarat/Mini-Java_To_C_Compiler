package ir.mz.minijava.visitor;

import ir.mz.minijava.ast.*;

/**
 * Convenience base class that provides default implementations returning null.
 */
public abstract class AbstractAstVisitor<R, P> implements AstVisitor<R, P> {
    @Override public R visit(Program node, P arg)      { return null; }
    @Override public R visit(ClassDecl node, P arg)    { return null; }
    @Override public R visit(MethodDecl node, P arg)   { return null; }
    @Override public R visit(VarDecl node, P arg)      { return null; }
    // TODO: add defaults for other nodes
}
