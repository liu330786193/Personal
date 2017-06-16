package FactoryMethod;

/**
 * Created by lyl on 2017/4/12.
 */
public class ConcreteCreatorTwo implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProductTwo();
    }
}
