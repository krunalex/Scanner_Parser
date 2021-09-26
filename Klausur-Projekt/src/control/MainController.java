package control;

import model.Auto;
import model.Fahrzeug;
import model.Motorrad;
import view.MainInterface;
import view.TankInterface;

import javax.swing.*;

public class MainController {
    private Auto myAuto;
    private JFrame myFrame;
    private MainInterface interface1;
    private TankInterface interface2;

    public static void main(String[] args) {
        MainController controller = new MainController();
        Fahrzeug[] f1 = new Fahrzeug[2];
        f1[0] = new Auto();
        f1[1] = new Motorrad();
    }

    public MainController(){
        createFrame();
    }

    public void createFrame(){
        myFrame = new JFrame("Klausur Projekt");
        interface1 = new MainInterface(this);
        interface2 = new TankInterface(this, interface1);
        myFrame.setVisible(true);
        myFrame.setBounds(0,0,500,500);
        myFrame.setContentPane(interface1.getMainPanel());
    }

    public void switchFrame(String panel){
        switch (panel) {
            case "start" -> myFrame.setContentPane(interface1.getMainPanel());
            case "tanken" -> myFrame.setContentPane(interface2.getTankPanel());
        }
        myFrame.revalidate();
    }

    public int getAutoStrecke(){
        return myAuto.berechneAutoStrecke();
    }
}
