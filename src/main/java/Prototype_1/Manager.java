package Prototype_1;

import java.util.HashMap;

/**
 * Created by lyl on 2017/6/16.
 */
public class Manager {

    private HashMap showCase = new HashMap();
    public void register(String name, Product prototype){
        showCase.put(name, prototype);
    }
    public Product create(String prototypeName){
        Product product = (Product) showCase.get(prototypeName);
        return product.createClone();
    }

}
