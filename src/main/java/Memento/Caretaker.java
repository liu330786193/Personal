package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Caretaker {

    private Memento.Memento memento;

    public Memento.Memento retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(Memento.Memento memento){
        this.memento = memento;
    }

}
