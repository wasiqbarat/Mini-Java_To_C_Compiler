package ast.expr;

import ast.Expression;
import java.util.List;

/** obj.method(args...) OR function(args...) */
public record CallExpr(Expression receiver, String methodName, List<Expression> args)
        implements Expression {
    public CallExpr {
        args = args == null ? List.of() : List.copyOf(args);
    }
}
