package Memento.HistoryOnSelf;


/**
 * Created by lyl on 2017/4/24.
 */
public class Originator {

    private String state;

    public Originator(){}

    public void changeState(String state){
        this.state = state;
        System.out.println("State has been changed to: " + state);
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(MementoIF memento){
        Memento m = (Memento)memento;
        changeState(m.getState());
    }

    class Memento implements MementoIF {
        private String state;

        public String getState() {
            return state;
        }

        public Memento(Originator originator) {
            this.state = originator.state;
        }
    }

}
