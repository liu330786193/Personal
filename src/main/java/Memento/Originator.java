package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Originator {

    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
