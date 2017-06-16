package Decorator.bill;

/**
 * Created by lyl on 2017/4/18.
 */
public class FooterDecorator extends OrderDecorator {
    public FooterDecorator(Order order) {
        super(order);
    }

    @Override
    public void print() {
        super.order.print();
        printFooter();
    }

    private void printFooter() {
        System.out.println("=========================================");
        System.out.println("Total\t\t\t" + formatCurrentCurrency(getGrandTotal()));
    }
}
