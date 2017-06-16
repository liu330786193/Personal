package Observer.Example;

import java.awt.*;
import java.awt.event.MouseListener;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteSubject extends Frame {

    private static MouseListener mouseListener;

    public ConcreteSubject(){}

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        mouseListener = new ConcreteListener();
        s.setBounds(100, 100, 100, 100);
        s.addMouseListener(mouseListener);
        s.show();
    }


}
