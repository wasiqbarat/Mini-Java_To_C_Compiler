package ast;

/**
 * Marker interface for every AST element.  
 * Having a common super-type lets us keep APIs simple (we can pass
 * around any {@code Node} rather than a long list of specific classes).
 */
public interface Node {
}
