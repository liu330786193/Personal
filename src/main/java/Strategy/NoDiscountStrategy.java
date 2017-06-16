package Strategy;

/**
 * Created by lyl on 2017/4/20.
 */
public class NoDiscountStrategy extends DiscountStrategy {

    private double price = 0;
    private int copies = 0;

    public NoDiscountStrategy(double price, int copies) {
        super(price, copies);
        this.price = price;
        this.copies = copies;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
