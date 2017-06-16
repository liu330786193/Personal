package Interpreter;

/**
 * Created by lyl on 2017/4/25.
 */
public abstract class Expression {

    public abstract boolean interpret(Context ctx);
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract String toString();

}
