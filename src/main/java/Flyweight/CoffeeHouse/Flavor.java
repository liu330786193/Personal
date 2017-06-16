package Flyweight.CoffeeHouse;

/**
 * Created by lyl on 2017/4/19.
 */
public class Flavor extends Order {

    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve(Table table) {
        System.out.println("Serving table " + table.getNumber() + " with flavor " + flavor);
    }

    @Override
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
