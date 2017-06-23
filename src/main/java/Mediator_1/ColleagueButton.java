package Mediator_1;

import java.awt.*;

/**
 * Created by lyl on 2017/6/21.
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption){
        super(caption);
    }

    @Override
    public void setMeditor(Mediator meditor) {
        this.mediator = meditor;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
