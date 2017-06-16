package Observer;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by lyl on 2017/4/21.
 */
public class Example3 extends Applet {

    private Action updateCursorAction = new AbstractAction() {
        int ind = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if (ind == 0){
                drawCursor(Cursor.NE_RESIZE_CURSOR);
            }else if (ind == 1){
                drawCursor(Cursor.N_RESIZE_CURSOR);
            }else if (ind == 2){
                drawCursor(Cursor.NW_RESIZE_CURSOR);
            }else if (ind == 3){
                drawCursor(Cursor.W_RESIZE_CURSOR);
            }else if (ind == 4){
                drawCursor(Cursor.SW_RESIZE_CURSOR);
            }else if (ind == 5){
                drawCursor(Cursor.S_RESIZE_CURSOR);
            }else if (ind == 6){
                drawCursor(Cursor.SE_RESIZE_CURSOR);
            }else if (ind == 7){
                drawCursor(Cursor.E_RESIZE_CURSOR);
                ind = -1;
            }
            ind++;
        }
    };

    private void drawCursor(int cursorType) {
        setCursor(Cursor.getPredefinedCursor(cursorType));
    }

    @Override
    public void init() {
        new Timer(300, updateCursorAction).start();
    }
}
