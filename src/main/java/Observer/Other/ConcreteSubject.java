package Observer.Other;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteSubject extends Subject {

    private String state;

    public void change(String newState){
        state = newState;
        this.notifyObservers();
    }

}
