package Pizzaprojekt.control;

import Pizzaprojekt.model.Tools.Furnace;
import Pizzaprojekt.model.Tools.KebabSkewer;
import Pizzaprojekt.model.Tools.SaladStorage;
import Pizzaprojekt.view.startInterface;

import javax.swing.*;

public class Doepi {

    public static void main(String[] args) { // Wird jetzt nen Frame erstellt
        new Doepi();
        new App();
        createFrame();
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage();
        KebabSkewer kebabSkewer = new KebabSkewer();
    }

    public Doepi(){
    }

    private static void createFrame(){ // Hab die Methode static gemacht, damit es im psvm klappt
        JFrame myFrame = new JFrame("Doepi App");
        myFrame.setVisible(true);
        startInterface interface1 = new startInterface();
        myFrame.setContentPane(interface1.getPanel());
        myFrame.setBounds(200,200,1000,750);
    }

    private void setContentPane(){
        // ToDo: Muss noch programmiert werden, damit wir zwischen mehreren Panels switchen können bei der App.
    }
}
