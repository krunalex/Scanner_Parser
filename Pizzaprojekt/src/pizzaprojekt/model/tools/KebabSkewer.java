package pizzaprojekt.model.tools;

public class KebabSkewer {

    private double status;
    private double price;
    private boolean getConsumed;
    private int skewerLeft;

    public KebabSkewer(){
        status = 100;
        skewerLeft = 5;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void consume(double status){
        if (getConsumed == true){
            status = status - 1.5; // Weiß nicht ob das so klappt - A.
        }
    }

    public void makeDoener(int type){
        consume(status);
    }

    public void change(){
        if (status <= 0){
            skewerLeft = skewerLeft - 1;
        }else{
            System.out.println("Alle Dönerspieße sind leer!");
        }
    }
}
