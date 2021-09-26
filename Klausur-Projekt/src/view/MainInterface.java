package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface {
    private MainController controller;
    private JLabel mainLabel;
    private JButton autoButton;
    private JButton motorradButton;
    private JPanel mainPanel;
    private int buttonZahl;

    public MainInterface(MainController controller){
        this.controller = controller;
        autoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonZahl = 0;
                controller.switchFrame("tanken");
            }
        });
        motorradButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonZahl = 1;
                controller.switchFrame("tanken");
            }
        });
    }

    public int getButtonZahl() {
        return buttonZahl;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
