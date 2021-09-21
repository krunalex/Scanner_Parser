package pizzaprojekt.control;

import com.formdev.flatlaf.FlatDarkLaf;
import pizzaprojekt.model.food.Kebab;
import pizzaprojekt.model.food.MenuCard;
import pizzaprojekt.model.food.Pizza;
import pizzaprojekt.model.food.Salad;
import pizzaprojekt.model.tools.*;
import pizzaprojekt.view.*;

import javax.swing.*;

public class Doepi {

    private double money = 1000;
    private JFrame myFrame;
    private startInterface interface1;
    private loginInterface interface2;
    private orderInterface interface3;
    private drinkInterface interface4;
    private foodInterface interface5;
    private exitInterface interface6;

    public static void main(String[] args) {
        Worker worker = new Worker();
        App myApp = new App();
        Doepi doepi = new Doepi();
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage(doepi);
    }

    public Doepi(){
        createFrame();
    }

    public void createFrame(){
        FlatDarkLaf.setup();
        myFrame = new JFrame("Doepi App");
        interface1 = new startInterface(this);
        interface2 = new loginInterface(this);
        interface5 = new foodInterface(this);
        interface4 = new drinkInterface(this);
        interface3 = new orderInterface(this, interface5, interface4);
        interface6 = new exitInterface(this);
        myFrame.setVisible(true);
        myFrame.setBounds(0,0,1000,1000);
        myFrame.setContentPane(interface1.getPanel());
    }

    public void switchFrame(String panel){
        switch(panel) {
            case "start":
                myFrame.setContentPane(interface1.getPanel());
                break;
            case "login":
                myFrame.setContentPane(interface2.getPanel());
                break;
            case "order":
                myFrame.setContentPane(interface3.getPanel());
                break;
            case "drink":
                myFrame.setContentPane(interface4.getPanel());
                break;
            case "food":
                myFrame.setContentPane(interface5.getPanel());
                break;
            case "worker":
                myFrame.setContentPane(interface7.getPanel());
                break;
            case "exit":
                myFrame.setContentPane(interface6.getPanel());
                break;
            default: myFrame.setContentPane(interface1.getPanel());
        }
        myFrame.revalidate();
    }

    public void closeFrame(){
        myFrame.dispose();
    }

    public int getBalance() {
        return balance;
    }

    public void setMoney(double money){
        this.money = money;
    }
}
