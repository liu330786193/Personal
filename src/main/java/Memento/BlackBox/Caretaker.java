package Memento.BlackBox;

/**
 * Created by lyl on 2017/4/24.
 */
public class Caretaker {

    private MementoIF memento;

    public MementoIF retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }

}
