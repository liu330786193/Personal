package Flyweight.Coffee;

/**
 * Created by lyl on 2017/4/19.
 */
public class Flavor extends Order {

    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve() {
        System.out.println("Serving flavor" + flavor);
    }

    @Override
    public String getFlavor() {
        return flavor;
    }

}
