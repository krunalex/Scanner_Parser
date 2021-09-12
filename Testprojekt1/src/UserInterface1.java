import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UserInterface1 {

    private JButton derAndereButton;
    private JTextField textField1;
    private JLabel label1;
    private JPanel panel1;
    private JButton dieserButtonButton;
    private JTextArea allerhandVorgegebenerTextTextArea;
    private JButton derFluchtknopfButton;

    public UserInterface1() {
        derAndereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(textField1.getText());
            }
        });
        dieserButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel1,"Was ist das denn!","Eine ernste Warnung",JOptionPane.WARNING_MESSAGE);
            }
        });
        derFluchtknopfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        allerhandVorgegebenerTextTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                String currentText = allerhandVorgegebenerTextTextArea.getText();
                currentText = currentText.replace('r','l');
                currentText = currentText.replace('R','L');
                allerhandVorgegebenerTextTextArea.setText(currentText);
            }
        });
    }

    public JPanel getPanel(){
        return panel1;
    }

}
