package pizzaprojekt.model.tools;

public class Furnace {

    private Money money;

    public Furnace(Money money){
        this.money = money;
    }


    public void makePizza(){
        money.setBalance(7);
    }
}
