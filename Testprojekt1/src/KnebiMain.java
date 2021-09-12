import javax.swing.*;

public class KnebiMain {

    private int meineZahl;

    public static void main(String[] args){
        new KnebiMain();
    }

    public KnebiMain(){
        System.out.println("Blubb!");
        for(int i = 0; i < 50; i++) {
            meineZahl++;
            System.out.println("Die Zahl ist " + meineZahl);
        }
        erzeugeFenster();
    }

    private void erzeugeFenster(){
        JFrame meinFenster = new JFrame("Das Superfenster");
        meinFenster.setVisible(true);
        UserInterface1 interface1 = new UserInterface1();
        meinFenster.setContentPane(interface1.getPanel());
        meinFenster.setBounds(200,200,500,500);

    }

}
