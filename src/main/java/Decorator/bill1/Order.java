package Decorator.bill1;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/18.
 */
public abstract class Order {

    protected String customName;

    protected Date salesDate;

    protected Vector items = new Vector(10);

    public void print(){
        items.stream().forEach(l -> {
            ((OrderLine)l).printLine();
        });
    }

    public void addItem(OrderLine item){
        items.addElement(item);
    }

    public void removeItem(OrderLine item){
        items.removeElement(item);
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    protected String getSubTotal(){
        double total = 0.0;
        for (Object obj : items){
            total += ((OrderLine)obj).getSubTotal();
        }
        return formatCurrency(total);
    }

    protected String formatCurrency(double amnt){
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
}
