package TemplateMethod.Bank;

/**
 * Created by lyl on 2017/4/20.
 */
public class Client {

    public static void main(String[] args){
        System.out.println("Interest from Money account " + new MoneyMarketAccount().calculateInterest());
        System.out.println("Interest from CD account " + new CDAAccount().calculateInterest());
    }

}
