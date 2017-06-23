package Mediator_1;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by lyl on 2017/6/21.
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague{

    private Mediator mediator;

    public ColleagueTextField(String text, int columns){
        super(text, columns);
    }

    @Override
    public void setMeditor(Mediator meditor) {
        this.mediator = meditor;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleaguesChanged();
    }
}
