package Observer_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by lyl on 2017/6/22.
 */
public abstract class NumberGenerator {
    private Vector<Observer> observers = new Vector<Observer>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        Iterator it = observers.iterator();
        while (it.hasNext()){
            ((Observer)it.next()).update();
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
