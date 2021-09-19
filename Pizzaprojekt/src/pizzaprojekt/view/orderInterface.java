package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;
import pizzaprojekt.view.foodInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class orderInterface {

    private JPanel orderPanel;
    private JLabel welcomeLabel;
    private JButton drinkButton;
    private JButton foodButton;
    private JButton finishOrderButton;
    private JLabel sumPriceLabel;
    private JButton updateButton;
    private Doepi myDoepi;
    private foodInterface foodInterface;

    public orderInterface(Doepi myDoepi, foodInterface myFoodInterface){
        this.myDoepi = myDoepi;
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumPriceLabel.setText("Ihr Gesamtpreis: " + foodInterface.getSumPrice());
            }
        });
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
        finishOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("exit");
            }
        });
    }

    public orderInterface(foodInterface myFoodInterface) {
    }

    public JPanel getPanel(){
        return orderPanel;
    }

}
