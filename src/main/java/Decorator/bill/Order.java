package Decorator.bill;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/18.
 */
public abstract class Order {

    private OrderLine lnkOrderLine;

    protected String customerName;

    protected Date salesDate;

    protected Vector items = new Vector(10);

    public void print(){
        items.stream().forEach(i -> {
            ((OrderLine)i).printLine();
        });
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public void addItem(OrderLine item){
        items.addElement(item);
    }

    public void removeItem(OrderLine item){
        items.removeElement(item);
    }

    public double getGrandTotal(){
        double amnt = 0.0d;
//        items.stream().forEach(i -> {
//            amnt += ((OrderLine)i).getSubtotal();
//        });
        for (Object obj : items){
            amnt += ((OrderLine)obj).getSubtotal();
        }
        return amnt;
    }

    protected String formatCurrentCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
}
