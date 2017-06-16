package Observer;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteObserver implements Observer.Observer {
    @Override
    public void update() {
        System.out.println("I am notified");
    }
}
