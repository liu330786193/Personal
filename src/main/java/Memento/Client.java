package Memento;

/**
 * Created by lyl on 2017/4/24.
 */
public class Client {

    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args) {
        o.setState("on");
        c.saveMemento(o.createMemento());
        o.setState("off");
        c.retrieveMemento();
    }

}
