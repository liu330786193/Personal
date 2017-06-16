package TemplateMethod.Bank;

/**
 * Created by lyl on 2017/4/20.
 */
public class CDAAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.065D;
    }
}
