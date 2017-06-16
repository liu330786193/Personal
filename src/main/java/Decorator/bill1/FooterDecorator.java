package Decorator.bill1;

/**
 * Created by lyl on 2017/4/18.
 */
public class FooterDecorator extends OrderDecorator {

    public FooterDecorator(Order order) {
        super(order);
    }

    @Override
    public void print() {
        order.print();
        printFooter();
    }

    private void printFooter() {
        System.out.println("=========================================");
        System.out.println("Total\t\t\t" + order.getSubTotal());
    }
}
