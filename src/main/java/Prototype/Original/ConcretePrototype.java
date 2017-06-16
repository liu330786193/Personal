package Prototype.Original;

/**
 * Created by lyl on 2017/4/14.
 */
public class ConcretePrototype implements Prototype {

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        }catch (Exception e){
            return null;
        }
    }

}
