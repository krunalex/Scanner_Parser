package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class loginInterface {
    private JPanel loginPanel;
    private JLabel loginText;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel passwordWrong;
    private Doepi myDoepi;
    private String username;

    public loginInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                char [] input = passwordField1.getPassword();
                if(checkIfCorrect(input)){
                    myDoepi.switchFrame("order");
                    username = textField1.getText();
                }else{
                    passwordWrong.setText("Falsches Passwort. Versuch es erneut!");
                }
            }
        });
    }

    public String getUsername() {
        return username;
    }

    public JPanel getPanel(){
        return loginPanel;
    }

    private boolean checkIfCorrect(char [] input){
        boolean isCorrect = false;
        char [] correctPass = {'1','2','3'};

        if(input.length != correctPass.length){
            isCorrect = false;
        }else{
            isCorrect = Arrays.equals(input, correctPass);
        }
        Arrays.fill(correctPass, '0');
        return isCorrect;
    }
}
