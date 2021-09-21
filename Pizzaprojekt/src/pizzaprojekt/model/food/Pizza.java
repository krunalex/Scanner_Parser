package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;

public class Pizza extends MenuCard {

    private Furnace furnace;
    public Pizza(Furnace furnace) {

    }

    @Override
    public void use() {
        furnace.makePizza();
    }

}