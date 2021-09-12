package Pizzaprojekt.model.Food;

public abstract class Drink extends MenuCard {

    protected String variety;
    protected double abundance; // abundace = Fülle

    public Drink(){
        super();
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String Variety) {
        this.variety = variety;
    }

    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(double abundance) {
        this.abundance = abundance;
    }
}
