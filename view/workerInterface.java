package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class workerInterface {
    private JPanel workerPanel;
    private JTextArea theOrder;
    private JButton confirmation;
    private JLabel Profit;
    private Doepi myDoepi;
    private foodInterface foodInterface;
    private drinkInterface drinkInterface;
    private loginInterface loginInterface;
    private int doener = 0;
    private int pizza = 0;
    private int salad = 0;
    private int water = 0;
    private int juice = 0;
    private int lemonade = 0;
    private String name;
    private int profit=0;

    public workerInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
            doener = foodInterface.getDoenerNumber();
            pizza = foodInterface.getPizzaNumber();
            salad = foodInterface.getSaladNumber();
            water = drinkInterface.getWaterNumber();
            juice = drinkInterface.getJuiceNumber();
            lemonade = drinkInterface.getLemonadeNumber();
            name = loginInterface.getUsername();
        profit = profit + doener*5 + pizza*7 + salad*3 + water + juice*3 + lemonade*4;
        Profit.setText("Profit bisher:" + profit + "€");
        theOrder.setText("Ich will " + doener + "Döner, " + pizza + "Pizza, " + salad + "Salat, " + water + "Wasser, "
        + juice + "Saft und " + lemonade + "Limonade - Bestellt von: " + name );

        confirmation.addActionListener(new ActionListener() {
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
