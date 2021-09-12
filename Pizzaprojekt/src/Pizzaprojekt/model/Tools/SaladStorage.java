package Pizzaprojekt.model.Tools;

import Pizzaprojekt.model.Food.Salad;

public class SaladStorage {

    private double abundance = 100;
    private int numberKit = 10; //anzahl muss angepasst werden
    private double abundancePrice = 10;

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
        /* Dafür brauchen wir zugriff auf Geld
        Geld++;
        if(numberKit == 0){
        numberKit = 10;
        Geld = Geld - 10;
        }
        */
    }
}
