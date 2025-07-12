package sem;

/** Exception thrown when semantic analysis fails. */
public class SemanticException extends RuntimeException {
    public SemanticException(String message) {
        super(message);
    }
}
