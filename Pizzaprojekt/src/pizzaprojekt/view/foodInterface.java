package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodInterface {
    private JPanel foodPanel;
    private JLabel availableLabel;
    private JButton zurückButton;
    private Doepi myDoepi;

    public foodInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        zurückButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("order");
            }
        });

    }

    public JPanel getPanel(){
        return foodPanel;
    }
}
