package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
