package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Money;
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
    public void use() {

    }


}
