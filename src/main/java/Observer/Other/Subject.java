package Observer.Other;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/21.
 */
public abstract class Subject {

    private Vector observersVector;

    public Subject() {
        observersVector = new Vector();
    }

    public void addListener(Observer observer){
        if (!observersVector.contains(observer)){
            observersVector.addElement(observer);
        }
    }

    public void removeListener(Observer observer){
        if (observersVector.contains(observer)){
            observersVector.removeElement(observer);
        }
    }

    public void notifyObservers(){
        Enumeration enumeration = ((Vector)observersVector.clone()).elements();
        while (enumeration.hasMoreElements()){
            ((Observer)enumeration.nextElement()).update();
        }
    }

}
