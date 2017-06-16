package Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteSubject implements Subject {

    private Vector observerVector;

    public ConcreteSubject() {
        observerVector = new Vector();
    }

    @Override
    public void attach(Observer.Observer observer) {
        if (!observerVector.contains(observer)){
            observerVector.addElement(observer);
        }
    }

    @Override
    public void detach(Observer.Observer observer) {
        if (observerVector.contains(observer)){
            observerVector.removeElement(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer.Observer)enumeration.nextElement()).update();
        }
    }

    private Enumeration observers() {
        return ((Vector)observerVector.clone()).elements();
    }
}
