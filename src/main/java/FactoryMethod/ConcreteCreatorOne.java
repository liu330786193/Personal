package FactoryMethod;

/**
 * Created by lyl on 2017/4/12.
 */
public class ConcreteCreatorOne implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProductOne();
    }
}
