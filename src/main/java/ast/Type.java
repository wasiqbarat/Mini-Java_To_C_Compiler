package ast;

/**
 * Very small type representation: either a primitive/builtin name (e.g. "int",
 * "boolean") or a user-defined class name.  The {@code isArray} flag indicates
 * whether it is an array of that element type.
 */
public record Type(String name, boolean isArray) implements Node {
    public static final Type INT      = new Type("int", false);
    public static final Type INT_ARR  = new Type("int", true);
    public static final Type BOOLEAN  = new Type("boolean", false);

    public boolean isPrimitive() {
        return name.equals("int") || name.equals("boolean");
    }

    @Override public String toString() {
        return name + (isArray ? "[]" : "");
    }
}
