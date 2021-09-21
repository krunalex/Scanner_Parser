package pizzaprojekt.model.tools;

import pizzaprojekt.control.Doepi;

public class SaladStorage {

    private double abundance = 100;
    private int numberKit = 35;
    private double abundancePrice = 2;
    private Doepi doepi;

    public SaladStorage(Doepi doepi){
        this.doepi = doepi;
    }

    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(double abundance) {
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

    public void use(int saladType){
        int newKit = 5;
        numberKit--;
        Salad s = new Salad(saladType);
        if(numberKit == 0){
            numberKit = 10;
            doepi.setMoney(doepi.getMoney() - newKit * abundancePrice);
        }
    }
}
