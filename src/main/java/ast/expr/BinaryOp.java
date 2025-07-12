package ast.expr;

/** Simple enumeration of binary operators supported by Mini-Java. */
public enum BinaryOp {
    MUL("*"), DIV("/"), MOD("%"),
    ADD("+"), SUB("-"),
    LT("<"), LTE("<="), GT(">"), GTE(">="), EQ("=="), NEQ("!="),
    AND("&&"), OR("||");

    public final String symbol;
    BinaryOp(String sym) { this.symbol = sym; }
    @Override public String toString() { return symbol; }
}
