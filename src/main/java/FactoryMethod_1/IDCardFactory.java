package FactoryMethod_1;

import JavaBean.Baby;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyl on 2017/6/16.
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList(10);

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
