package Strategy;

/**
 * Created by lyl on 2017/4/20.
 */
public class PercentageStrategy extends DiscountStrategy {

    private double price = 0;
    private int copies = 0;
    private double percent;

    public PercentageStrategy(double price, int copies) {
        super(price, copies);
    }

    @Override
    public double calculateDiscount() {
        return copies * price * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
