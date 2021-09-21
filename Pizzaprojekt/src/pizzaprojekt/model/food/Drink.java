package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.Money;
import pizzaprojekt.model.tools.SaladStorage;

public class Drink extends MenuCard {

    private int waterPrice = 1;
    private int juicePrice = 3;
    private int lemonadePrice = 4;
    private int totalPrice = 0;
    private Money money;

    public Drink(Money money, int numberWater, int numberJuice, int numberLemonade){
        totalPrice = numberWater*waterPrice + numberJuice*juicePrice + numberLemonade*lemonadePrice;
        money.setBalance(totalPrice);
    }

    public int getTotalPrice() {
        return totalPrice;
    }


    @Override
    public void use(Furnace furnace) {

    }

    @Override
    public void use(SaladStorage saladStorage) {

    }

    @Override
    public void use(KebabSkewer kebabSkewer) {

    }
}
