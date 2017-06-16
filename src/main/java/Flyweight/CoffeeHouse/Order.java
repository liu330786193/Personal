package Flyweight.CoffeeHouse;

/**
 * Created by lyl on 2017/4/19.
 */
public abstract class Order {

    public abstract void serve(Table table);

    public abstract String getFlavor();

}
