package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface {
    private MainController myController;
    private JButton pizzaButton;
    private JButton burgerButton;
    private JPanel mainPanel;

    public MainInterface(MainController myController){
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myController.eatPizza();
            }
        });
        burgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myController.eatBurger();
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
