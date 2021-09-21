package pizzaprojekt.control;

import com.formdev.flatlaf.FlatDarkLaf;
import pizzaprojekt.model.food.*;
import pizzaprojekt.model.tools.*;
import pizzaprojekt.view.*;

import javax.swing.*;

public class Doepi {

    private JFrame myFrame;
    private startInterface interface1;
    private loginInterface interface2;
    private orderInterface interface3;
    private drinkInterface interface4;
    private foodInterface interface5;
    private exitInterface interface6;
    private workerInterface interface7;
    private Money money;
    private int balance = 0;
    private Furnace furnace;
    private SaladStorage saladStorage;
    private KebabSkewer kebabSkewer;

    public static void main(String[] args) {
        App myApp = new App();
        Doepi doepi = new Doepi();

    }

    public Doepi(){
        money = new Money();
        furnace = new Furnace(money);
        saladStorage = new SaladStorage(money);
        kebabSkewer = new KebabSkewer(money);
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
        interface7 = new workerInterface(this,interface5,interface4,interface2);
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

    public void doTheOrder(){
        MenuCard[] mc = new MenuCard[4];
        mc[0] = new Pizza(furnace);
        mc[1] = new Kebab(kebabSkewer);
        mc[2] = new Salad(saladStorage);
        mc[3] = new Drink(money, interface4.getWaterNumber(),interface4.getJuiceNumber(),interface4.getLemonadeNumber());
        for(int i = 0;i<interface5.getPizzaNumber();i++){
            ((Pizza) mc[0]).use();
        }
        for(int i = 0;i<interface5.getDoenerNumber();i++) {
            ((Kebab) mc[1]).use();
        }
        for(int i = 0;i<interface5.getSaladNumber();i++) {
            ((Salad) mc[2]).use();
        }
        balance = money.getBalance();
    }

    public void closeFrame(){
        myFrame.dispose();
    }

    public int getBalance() {
        return balance;
    }

    public void makeKebabSkewer(){
        KebabSkewer kebabSkewer = new KebabSkewer(money);
        money.setBalance(-1);
        kebabSkewer.setNumberSkewer(kebabSkewer.getNumberSkewer() + 1);
    }
}
