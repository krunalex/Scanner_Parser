package pizzaprojekt.control;

import pizzaprojekt.model.people.Worker;
import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.SaladStorage;
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

    public static void main(String[] args) {
        //todo Worker erstellen
        App myApp = new App();
        Doepi myDoepi = new Doepi();
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage();
        KebabSkewer kebabSkewer = new KebabSkewer();
    }

    public Doepi(){
        createFrame();
    }

    public void createFrame(){
        myFrame = new JFrame("Doepi App");
        interface1 = new startInterface(this);
        interface2 = new loginInterface(this);
        interface3 = new orderInterface(this);
        interface4 = new drinkInterface(this);
        interface5 = new foodInterface(this);
        myFrame.setVisible(true);
        myFrame.setBounds(200,200,1000,750);
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
            default: myFrame.setContentPane(interface1.getPanel());
        }
        myFrame.revalidate();
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double money){
        this.money = money;
    }
}
