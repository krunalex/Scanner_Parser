package Pizzaprojekt.control;

import Pizzaprojekt.model.Tools.Furnace;
import Pizzaprojekt.model.Tools.KebabSkewer;
import Pizzaprojekt.model.Tools.SaladStorage;
import Pizzaprojekt.view.loginInterface;
import Pizzaprojekt.view.startInterface;

import javax.swing.*;

public class Doepi {

    public static void main(String[] args) {
        new Doepi();
        new App();
        createFrame("1");
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage();
        KebabSkewer kebabSkewer = new KebabSkewer();
    }

    public Doepi(){
    }

    public static void createFrame(String panel){
        JFrame myFrame = new JFrame("Doepi App");
        myFrame.setVisible(true);
        startInterface interface1 = new startInterface();
        loginInterface interface2 = new loginInterface();
        switch(panel) {
            case "start":
                myFrame.setContentPane(interface1.getPanel());
                break;
            case "login":
                myFrame.setContentPane(interface2.getPanel());
                // ToDo: Der erste Panel muss gelöscht bzw. geschlossen werden.
                break;
            default: myFrame.setContentPane(interface1.getPanel());
            break;
        }
        myFrame.setBounds(200,200,1000,750);
    }
}
