package Observer;

/**
 * Created by lyl on 2017/4/21.
 */
public interface Subject {

    void attach(Observer.Observer observer);

    void detach(Observer.Observer observer);

    void notifyObservers();

}
