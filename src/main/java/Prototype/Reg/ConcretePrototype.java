package Prototype.Reg;

import Prototype.Original.Prototype;

/**
 * Created by lyl on 2017/4/14.
 */
public class ConcretePrototype implements Prototype {
    public synchronized Prototype clone() {
        Prototype temp = null;
        try {
            temp = (Prototype) super.clone();
            return temp;
        }catch (CloneNotSupportedException e){
            System.out.println("Clone failed");
        }finally {
            return temp;
        }
    }
}
