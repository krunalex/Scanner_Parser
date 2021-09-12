package Pizzaprojekt.view;
import Pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startInterface extends Doepi {

    private JButton startAppButton;
    private JPanel startPanel;

    public startInterface() {
        startAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createFrame("login");
            }
        });
    }

    public JPanel getPanel(){
        return startPanel;
    }
}
