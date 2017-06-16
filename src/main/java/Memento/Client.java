package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Client {

    private static Memento.Originator o = new Memento.Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args) {
        o.setState("on");
        c.saveMemento(o.createMemento());
        o.setState("off");
        c.retrieveMemento();
    }

}
