package FactoryMethod_1;

/**
 * Created by lyl on 2017/6/16.
 */
public abstract class Factory {

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);
}
