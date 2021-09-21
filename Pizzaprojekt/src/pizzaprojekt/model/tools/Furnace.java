package pizzaprojekt.model.tools;

import pizzaprojekt.model.food.Pizza;

public class Furnace {

    private Money money;

    public Furnace(Money money){

    }


    public void makePizza(){
        try {
            wait(5000); // einfach damit der auch nen sinn hat
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Pizza pizza = new Pizza(this);
        money.setBalance(7);
    }
}
