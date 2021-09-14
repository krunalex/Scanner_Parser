package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loginInterface {
    private JPanel loginPanel;
    private JLabel loginText;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private Doepi myDoepi;

    public loginInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;

        System.out.println(getFileContent(new File("Pizzaprojekt/src/pizzaprojekt/database/datenbank.txt")));
        // ToDo: Daten vergleichen fürs Login und Passwort

    }

    public JPanel getPanel(){
        return loginPanel;
    }

    private String getFileContent(File f){
        String s = "";
        try {
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                s += data + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return s;
    }

}
