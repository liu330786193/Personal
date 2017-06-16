package Decorator.bill1;

/**
 * Created by lyl on 2017/4/18.
 */
public class OrderDecorator extends Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.customName = order.customName;
        this.salesDate = order.salesDate;
    }

    @Override
    public void print() {
        super.print();
    }

}
