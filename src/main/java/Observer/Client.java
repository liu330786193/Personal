package Observer;

/**
 * Created by lyl on 2017/4/21.
 */
public class Client {


    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(concreteObserver);
        concreteSubject.notifyObservers();
    }

}
