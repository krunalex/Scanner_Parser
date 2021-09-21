package pizzaprojekt.model.tools;

public class SaladStorage {

    private int abundance = 40;
    private int numberKit = 35;
    private double abundancePrice = 2;
    private Money money;

    public SaladStorage(Money money){
        this.money = money;
    }

    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(int abundance) {
        this.abundance = abundance;
    }

    public int getNumberKit() {
        return numberKit;
    }

    public void setNumberKit(int numberKit) {
        this.numberKit = numberKit;
    }

    public double getAbundancePrice() {
        return abundancePrice;
    }

    public void setAbundancePrice(double abundancePrice){
        this.abundancePrice = abundancePrice;
    }

    public void makeSalad(){
        abundance--;
        if(abundance == 0){
            abundance = 39;
            money.setBalance(-10);
        }
        money.setBalance(3);
    }
}
