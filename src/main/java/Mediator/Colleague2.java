package Mediator;

/**
 * Created by lyl on 2017/4/25.
 */
public class Colleague2 extends Colleague {


    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("This is an action from Colleague 2");
    }
}
