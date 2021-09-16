package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class drinkInterface {
    private JPanel drinkPanel;
    private JLabel availableLabel;
    private JButton waterButton;
    private JButton juiceButton;
    private JButton lemonadeButton;
    private JButton zurückButton;
    private Doepi myDoepi;

    public drinkInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        zurückButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("order");
            }
        });

    }

    public JPanel getPanel(){
        return drinkPanel;
    }
}
