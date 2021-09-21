package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class workerInterface {
    private JButton confirmButton;
    private JLabel profitLabel;
    private JLabel orderLabel;
    private JPanel workerPanel;
    private JButton updateButton;
    private JButton restartButton;
    private Doepi myDoepi;
    private foodInterface myFoodInterface;
    private drinkInterface myDrinkInterface;
    private loginInterface myLoginInterface;
    private int doener = 0;
    private int pizza = 0;
    private int salad = 0;
    private int water = 0;
    private int juice = 0;
    private int lemonade = 0;
    private String name;
    private int profit = 0;

    public workerInterface(Doepi myDoepi, foodInterface myFoodInterface, drinkInterface myDrinkInterface, loginInterface myLoginInterface){
        this.myDoepi = myDoepi;
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doener = myFoodInterface.getDoenerNumber();
                pizza = myFoodInterface.getPizzaNumber();
                salad = myFoodInterface.getSaladNumber();
                water = myDrinkInterface.getWaterNumber();
                juice = myDrinkInterface.getJuiceNumber();
                lemonade = myDrinkInterface.getLemonadeNumber();
                name = myLoginInterface.getUsername();
                profit = myDoepi.getBalance();
                profitLabel.setText("Profit bisher: " + profit + "€");
                orderLabel.setText("Ich will " + doener + " Döner, " + pizza + " Pizza, " + salad + " Salat, " + water + " Wasser, "
                        + juice + " Saft und " + lemonade + " Limonade - Bestellt von:  " + name );

            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("exit");
            }
        });
    }
    public JPanel getPanel(){
        return workerPanel;
    }
}
