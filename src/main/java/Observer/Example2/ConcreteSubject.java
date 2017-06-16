package Observer.Example2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteSubject extends Frame {

    private static MouseListener m;

    public ConcreteSubject(){}

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.setBounds(100,100,100,100);
        s.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getWhen());
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        s.setVisible(true);
    }

}
