package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TankInterface {
    private MainInterface myMainInterface;
    private MainController myController;
    private JButton tankenButton;
    private JLabel tankLabel;
    private JLabel priceLabel;
    private JPanel tankPanel;
    private JLabel streckeLabel;
    private int autoStrecke;

    public TankInterface(MainController myController, MainInterface myMainInterface){
        autoStrecke = myController.getAutoStrecke();
        tankenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myMainInterface.getButtonZahl() == 0){
                    priceLabel.setText("Kosten: 100€");
                    streckeLabel.setText("Verbleibende Strecke: " + autoStrecke);
                }else {
                    priceLabel.setText("Kosten: 50€");
                    streckeLabel.setText("Verbleibende Strecke: " );
                }
            }
        });
    }

    public JPanel getTankPanel() {
        return tankPanel;
    }
}
