package TemplateMethod.Bank;

/**
 * Created by lyl on 2017/4/20.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045D;
    }
}
