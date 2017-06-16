package FactoryMethod;

/**
 * Created by lyl on 2017/4/12.
 */
public class Client {

    private static Creator creator1, creator2;
    private static Product prod1, prod2;

    public static void main(String[] args){
        creator1 = new ConcreteCreatorOne();
        prod1 = creator1.factory();
        creator2 = new ConcreteCreatorTwo();
        prod2 = creator2.factory();
    }

}
