package Flyweight.Coffee;

/**
 * Created by lyl on 2017/4/19.
 */
public class Client {

    private static Order[] flavors = new Flavor[20];
    private static int orderMade = 0;
    private static FlavorFactory flavorFactory;

    private static void takeOrders(String aFlavor){
        flavors[orderMade++] = flavorFactory.getOrder(aFlavor);
    }

    public static void main(String[] args){
        flavorFactory = new FlavorFactory();
        takeOrders("Black Coffee");
        takeOrders("Capucino");
        takeOrders("Espresso");
        takeOrders("Capucino");
        takeOrders("Capucino");
        takeOrders("Black Coffee");
        takeOrders("Espresso1");
        for (int i = 0; i < orderMade; i++){
            flavors[i].serve();
        }
        System.out.println("\nTotal teaFlavor objects made:" + flavorFactory.getTotalFlavorsMade());
    }

}
