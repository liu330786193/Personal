package Observer.Example2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteListener extends MouseAdapter {

    public ConcreteListener() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getWhen());
    }
}
