package TemplateMethod.Bank;

/**
 * Created by lyl on 2017/4/20.
 */
public abstract class Account {

    protected String accountNumber;

    public Account() {
        this.accountNumber = null;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        Double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }

    public final Double calculateAmount(String accountType, String accountNumber){
        return 7246.00d;
    }

    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateInterestRate();


}
