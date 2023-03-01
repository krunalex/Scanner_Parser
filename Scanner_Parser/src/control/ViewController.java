package control;

import view.GUI;

import javax.swing.*;

public class ViewController {
    public ViewController(){
        GUI g = new GUI();
        JFrame myFrame = new JFrame();
        myFrame.setVisible(true);
        myFrame.setBounds(500, 300, 900, 600);
        myFrame.setContentPane(g.getPanel());
    }
}
