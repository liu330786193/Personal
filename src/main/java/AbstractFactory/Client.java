package AbstractFactory;

/**
 * Created by lyl on 2017/4/12.
 */
public class Client {

    public static void main(String[] args){
        Creator creatorA = new ConcreteCreator1();
        creatorA.factoryA();
        creatorA.factoryB();
        Creator creatorB = new ConcreteCreator2();
        creatorB.factoryA();
        creatorB.factoryB();
    }

}
