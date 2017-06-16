package Interpreter;

import java.util.HashMap;

/**
 * Created by lyl on 2017/4/25.
 */
public class Context {

    private HashMap map = new HashMap();
    public void assign(Variable var, boolean value){
        map.put(value, new Boolean(value));
    }
    public boolean lookup(Variable var) throws IllegalArgumentException{
        Boolean value = (Boolean) map.get(var);
        if (value == null){
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }

}
