package Observer.Example;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteListener implements MouseListener {

    public ConcreteListener() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getWhen());
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
}
