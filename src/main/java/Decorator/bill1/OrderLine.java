package Decorator.bill1;

import java.text.NumberFormat;

/**
 * Created by lyl on 2017/4/18.
 */
public class OrderLine {

    private String itemName;

    private int count;

    private double price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printLine(){
        System.out.println(itemName + "\t" + count + "\t" + price + "\t" + formatCurrency(getSubTotal()) + "\n");
    }

    public double getSubTotal() {
        return count * price;
    }

    public String formatCurrency(double amount){
        return NumberFormat.getCurrencyInstance().format(amount);
    }
}
