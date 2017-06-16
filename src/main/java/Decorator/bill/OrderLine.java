package Decorator.bill;

import java.text.NumberFormat;

/**
 * Created by lyl on 2017/4/18.
 */
public class OrderLine {

    private String itemName;

    private int units;

    private double unitPrice;
    
    public void printLine(){
        System.out.println(
                itemName + "\t" + units
                + "\t" + formatCurrentCurrency(unitPrice)
                + "\t" + formatCurrentCurrency(getSubtotal()));
    }

    public double getSubtotal() {
        return unitPrice * units;
    }

    private String formatCurrentCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
