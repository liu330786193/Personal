package Observer;

/**
 * Created by lyl on 2017/4/21.
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

}
