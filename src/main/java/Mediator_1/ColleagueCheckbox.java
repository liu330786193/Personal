package Mediator_1;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by lyl on 2017/6/21.
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
        super(caption, group, state);
    }

    @Override
    public void setMeditor(Mediator meditor) {
        this.mediator = meditor;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleaguesChanged();
    }
}
