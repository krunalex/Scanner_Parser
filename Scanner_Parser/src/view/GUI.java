package view;

import control.ProgramController;
import javax.swing.*;

public class GUI {
    private JPanel myPanel;
    private JTextField codeField;
    private JButton scanButton;
    private JButton parseButton;
    private JLabel scanOutput;
    private JLabel parseOutput;
    private JLabel text;

    public GUI() {
        ProgramController p = new ProgramController();
        scanButton.addActionListener(e -> scanOutput.setText(p.scan(codeField.getText()) ? "Output: OK (" + codeField.getText() + ")" : "Output: NOT OK"));
        parseButton.addActionListener(e -> parseOutput.setText(p.parse() ? "Output: OK" : "Output: NOT OK"));
    }

    public JPanel getPanel(){
        return myPanel;
    }

}
