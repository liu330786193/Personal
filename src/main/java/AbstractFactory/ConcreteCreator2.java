package AbstractFactory;

/**
 * Created by lyl on 2017/4/12.
 */
public class ConcreteCreator2 implements Creator {

    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
