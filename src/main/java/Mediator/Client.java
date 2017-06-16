package Mediator;

/**
 * Created by lyl on 2017/4/25.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague1 c1 = new Colleague1(mediator);
        Colleague2 c2 = new Colleague2(mediator);
        mediator.colleagueChanged(c1);
    }

}
