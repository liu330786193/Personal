package Prototype.Reg;

import java.util.Vector;

/**
 * Created by lyl on 2017/4/14.
 */
public class PrototypeManager {

    private Vector objects = new Vector();
    public void add(Prototype obj){
        objects.add(obj);
    }
    public Prototype get(int i){
        return (Prototype) objects.get(i);
    }
    public int getSize(){
        return objects.size();
    }
}
