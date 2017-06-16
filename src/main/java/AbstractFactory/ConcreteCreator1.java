package AbstractFactory;

/**
 * Created by lyl on 2017/4/12.
 */
public class ConcreteCreator1 implements Creator {

    @Override
    public ProductA1 factoryA(){
        return new ProductA1();
    }

    @Override
    public ProductB1 factoryB(){
        return new ProductB1();
    }

}
