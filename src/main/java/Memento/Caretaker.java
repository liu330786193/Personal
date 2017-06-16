package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Caretaker {

    private Memento memento;

    public Memento retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(Memento memento){
        this.memento = memento;
    }

}
