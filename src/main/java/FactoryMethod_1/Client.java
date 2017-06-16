package FactoryMethod_1;

/**
 * Created by lyl on 2017/6/16.
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小红");
        Product card2 = factory.create("小明");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }

}
