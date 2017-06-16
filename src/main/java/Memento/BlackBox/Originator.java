package Memento.BlackBox;

/**
 * Created by lyl on 2017/4/24.
 */
public class Originator {

    private String state;

    public Originator() {
    }

    public MementoIF createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(MementoIF mementoIF){
        Memento memento = (Memento) mementoIF;
    }

    protected class Memento implements MementoIF{
        private String savedState;

        private Memento(String savedState) {
            this.savedState = savedState;
        }

        public void setState(String savedState) {
            this.savedState = savedState;
        }

        public String getState() {
            return savedState;
        }
    }

}
