package Decorator.bill1;

/**
 * Created by lyl on 2017/4/18.
 */
public class HeaderDecorator extends OrderDecorator {


    public HeaderDecorator(Order order) {
        super(order);
    }

    @Override
    public void print() {
        printHeader();
        order.print();
    }

    private void printHeader() {

        System.out.println("\t\t\t***\tINVOICE\t\t\t***");
        System.out.println(order.getCustomName() + "\nDate Of Sale:");
        System.out.println(order.getSalesDate());
        System.out.println("=========================================");
        System.out.println("Item\t\tcount\tPrice\tSubtotal");

    }

}
