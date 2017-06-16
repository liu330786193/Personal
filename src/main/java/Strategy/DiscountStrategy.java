package Strategy;

/**
 * Created by lyl on 2017/4/20.
 */
public abstract class DiscountStrategy {

    private double price = 0;
    private int copies = 0;

    public abstract double calculateDiscount();

    public DiscountStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

}
