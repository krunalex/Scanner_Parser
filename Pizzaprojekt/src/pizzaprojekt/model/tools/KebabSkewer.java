package pizzaprojekt.model.tools;
import pizzaprojekt.control.Doepi;
import pizzaprojekt.model.food.Kebab;

public class KebabSkewer{

    private double status;
    private double price;
    private boolean getConsumed;
    private int numberSkewer;
    private Kebab kebab;
    private Doepi doepi;
    private Money money;

    public KebabSkewer(Kebab kebab, Doepi doepi){
        status = 100;
        numberSkewer = 5;
        this.kebab = kebab;
        this.doepi = doepi;
    }

    public KebabSkewer() {

    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        status = status;
    }

    public void useSkewer(){
        if(numberSkewer >= 1){
            if (getConsumed){
                status = status - 1.5;
                makeKebab();
                if (status <= 0) {
                    doepi.makeKebabSkewer();
                }
            }
        }else{
            doepi.makeKebabSkewer();
        }
    }

    public void makeKebab(){
        Kebab kebab = new Kebab();
    }

    public int getNumberSkewer(){
        return numberSkewer;
    }

    public void setNumberSkewer(int skewer){
        this.numberSkewer = numberSkewer;
    }

   /* public boolean skewerLeft(){
        if (status <= 0){
            numberSkewer = numberSkewer - 1;
            return true;
        }else{
            System.out.println("Alle Dönerspieße sind leer!");
            return false;
        }
    }*/
}
