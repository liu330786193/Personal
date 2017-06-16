package Strategy;

/**
 * Created by lyl on 2017/4/20.
 */
public class FlatRateStrategy extends DiscountStrategy {

    private double amount;

    private double price = 0;
    private int copies = 0;

    public FlatRateStrategy(double price, int copies) {
        super(price, copies);
    }

    @Override
    public double calculateDiscount() {
        return copies * amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
