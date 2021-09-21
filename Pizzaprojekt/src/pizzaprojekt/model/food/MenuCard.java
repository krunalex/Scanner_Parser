package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;

public abstract class MenuCard {

    protected double price;
    protected boolean orderReady;
    protected String[] ingredians;

    public MenuCard(){ //todo Parameter fehlen
        this.price = price;
        this.orderReady = orderReady;
        this.ingredians = ingredians;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getOrderReady(){
        return orderReady;
    }

    public void setOrderReady(boolean orderReady) {
        this.orderReady = orderReady;
    }

    public void setIngredians(String[] ingredians) {
        this.ingredians = ingredians;
    }

    public String[] getIngredians() {
        return ingredians;
    }


    public abstract void use(Furnace furnace);

    public abstract void use(SaladStorage saladStorage);

    public abstract void use(KebabSkewer kebabSkewer);
}
