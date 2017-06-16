package Decorator.bill1;

import java.util.Date;

/**
 * Created by lyl on 2017/4/18.
 */
public class Client {

    private static Order order;
    public static void main(String[] args){
        order = new SaleOrder();
        order.setSalesDate(new Date());
        order.setCustomName("lyl");
        OrderLine line1 = new OrderLine();
        line1.setItemName("FireWheel Tire");
        line1.setPrice(154.23);
        line1.setCount(4);
        order.addItem(line1);
        OrderLine line2 = new OrderLine();
        line2.setItemName("Front Fender");
        line2.setPrice(300.45);
        line2.setCount(1);
        order.addItem(line2);
        order = new HeaderDecorator(new FooterDecorator(order));
        order.print();
    }


}
