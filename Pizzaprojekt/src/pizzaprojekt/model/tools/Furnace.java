package pizzaprojekt.model.tools;

import pizzaprojekt.model.food.Pizza;

public class Furnace {
    private double timer;
    private boolean available;

    public Furnace(){
        this.timer = timer;
        this.available = available;

    }

    public double getTimer(){
      return timer;
    }

    public void setTimer(double timer){
        this.timer = timer;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void use(int type) throws InterruptedException {
        if(getAvailable()){
            setAvailable(false);
            wait(500);
            Pizza pizza = new Pizza(type);
        }
        setAvailable(true);
    }
}
