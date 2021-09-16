package pizzaprojekt.model.tools;
import pizzaprojekt.control.Doepi;
import pizzaprojekt.model.food.Kebab;

public class KebabSkewer{

    private double status;
    private double price;
    private boolean getConsumed;
    private int skewerLeft;
    private Kebab kebab;
    private Doepi doepi;

    public KebabSkewer(Kebab kebab, Doepi doepi){
        status = 100;
        skewerLeft = 5;
        this.kebab = kebab;
        this.doepi = doepi;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        status = status;
    }

    public void use(){
        if(skewerLeft()){
            if (getConsumed){
                status = status - 1.5;
            }
        }else{
            System.out.println("Wir haben leider kein Fleisch mehr :(");
        }
    }

    public void makeKebab(int type){
        double productPrice = 1;
        use();
        Kebab kebab = new Kebab();
        doepi.setMoney(doepi.getMoney()- productPrice);
    }

    public boolean skewerLeft(){
        if (status <= 0){
            skewerLeft = skewerLeft - 1;
            return true;
        }else{
            System.out.println("Alle Dönerspieße sind leer!");
            return false;
        }
    }
}
