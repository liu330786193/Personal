package Observer;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/21.
 */
public class Client {

    @Test
    public void test(){
        Observer.ConcreteObserver concreteObserver = new Observer.ConcreteObserver();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(concreteObserver);
        concreteSubject.notifyObservers();
    }

}
