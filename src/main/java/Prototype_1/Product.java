package Prototype_1;

/**
 * Created by lyl on 2017/6/16.
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
