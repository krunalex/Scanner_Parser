package pizzaprojekt.model.tools;

import pizzaprojekt.model.food.Salad;

public class SaladStorage {

    private double abundance = 100;
    private int numberKit = 35;
    private double abundancePrice = 10;
  //  private Doepi myDoepi;

    public SaladStorage(){

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

    public void createSalad(int saladType){
        numberKit--;
        Salad s = new Salad(saladType);
        //toDo Geld implememtieren, ein Budget für Doepi
       /* if(numberKit == 0){
            numberKit = 10;
            // myDoepi.setMoney(-10);
        } */
    }
}
