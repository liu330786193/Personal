package Mediator_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lyl on 2017/6/21.
 */
public class LoginFrame extends Frame implements ActionListener, Mediator{

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton btnOk;
    private ColleagueButton btnCancel;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(btnOk);
        add(btnCancel);
        colleaguesChanged();
        pack();
        show();
    }

    @Override
    public void createColleagues() {

    }

    @Override
    public void colleaguesChanged() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
