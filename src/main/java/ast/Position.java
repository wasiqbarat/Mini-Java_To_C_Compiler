package ast;

/**
 * A very lightweight source-location record: line & column of start token.
 * This is optional; you can attach it to nodes when producing error messages.
 */
public record Position(int line, int column) {
    public static final Position NONE = new Position(-1, -1);
}
