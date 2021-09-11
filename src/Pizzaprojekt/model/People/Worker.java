package Pizzaprojekt.model.People;

import Pizzaprojekt.model.Tools.Furnace;
import Pizzaprojekt.model.Tools.KebabSkewer;
import Pizzaprojekt.model.Tools.SaladStorage;

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
