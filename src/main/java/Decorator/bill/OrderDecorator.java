package Decorator.bill;

/**
 * Created by lyl on 2017/4/18.
 */
public class OrderDecorator extends Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.salesDate = order.getSalesDate();
        this.setCustomerName(order.getCustomerName());
    }

    @Override
    public void print() {
        super.print();
    }
}
