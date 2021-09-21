package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;

public class Pizza extends MenuCard {

    private Furnace furnace;
    public Pizza(Furnace furnace) {
        use(furnace);
    }


    @Override
    public void use(Furnace furnace) {
        furnace.makePizza();
    }

    @Override
    public void use(SaladStorage saladStorage) {

    }

    @Override
    public void use(KebabSkewer kebabSkewer) {

    }

}