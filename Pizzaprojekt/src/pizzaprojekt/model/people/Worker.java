package pizzaprojekt.model.people;

import pizzaprojekt.model.food.Drink;
import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;


public class Worker extends Human {
    private Furnace furnace;
    private KebabSkewer kebabSkewer;
    private SaladStorage saladStorage;

    public Worker(){

    }

    public void setFurnace(Furnace furnace) {
        this.furnace = furnace;
    }

    public Furnace getFurnace() {
        return furnace;
    }

    public void setKebabSkewer(KebabSkewer kebabSkewer) {
        this.kebabSkewer = kebabSkewer;
    }

    public KebabSkewer getKebabSkewer() {
        return kebabSkewer;
    }

    public void setSaladStorage(SaladStorage saladStorage) {
        this.saladStorage = saladStorage;
    }

    public SaladStorage getSaladStorage() {
        return saladStorage;
    }

    public void processOrder(){

    }
}
