package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class orderInterface {
    private JPanel orderPanel;
    private JLabel welcomeLabel;
    private JButton drinkButton;
    private JButton foodButton;
    private Doepi myDoepi;

    public orderInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        drinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("drink");
            }
        });
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("food");
            }
        });
    }

    public JPanel getPanel(){
        return orderPanel;
    }
}
