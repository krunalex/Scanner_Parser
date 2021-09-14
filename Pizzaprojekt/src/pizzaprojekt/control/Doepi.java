package pizzaprojekt.control;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;
import pizzaprojekt.view.loginInterface;
import pizzaprojekt.view.startInterface;

import javax.swing.*;

public class Doepi {

    private double money = 1000;
    private JFrame myFrame;
    private startInterface interface1;
    private loginInterface interface2;

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
            default: myFrame.setContentPane(interface1.getPanel());
            break;
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
