package control;
import model.Burger;
import model.Doener;
import model.Food;
import model.Pizza;
import view.MainInterface;
import javax.swing.*;

public class MainController {
    private Food myFood;
    private Pizza myPizza;
    private Burger myBurger;

    public static void main(String[] args) {
        MainController controller = new MainController();
    }

    public MainController(){
        Food[][] b1 = new Burger[2][2]; // Mehrdimensionale Arrays & Subtyping
        b1[0][0] = new Burger();
        b1[0][1] = new Burger();
        b1[1][0] = new Burger();
        b1[1][1] = new Burger();

        Food f1 = new Doener(); // Typecast
        ((Doener)f1).eat(); // Typecast

        myPizza = new Pizza();
        myBurger = new Burger();
        createFrame();
    }

    public void createFrame(){
        JFrame myFrame = new JFrame("Klausur-Projekt");
        MainInterface interface1 = new MainInterface(this);
        myFrame.setVisible(true);
        myFrame.setBounds(0,0,500,500);
        myFrame.setContentPane(interface1.getMainPanel());
    }

    public void eatPizza(){
        myPizza.eat();
    }

    public void eatBurger(){
        myBurger.eat();
    }
}
