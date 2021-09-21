package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;

public class Salad extends MenuCard {

    private SaladStorage saladStorage;
    public Salad(SaladStorage saladStorage){
        use(saladStorage);
    }

    @Override
    public void use(SaladStorage saladStorage) {
        saladStorage.makeSalad();
    }


    @Override
    public void use(Furnace furnace) {

    }



    @Override
    public void use(KebabSkewer kebabSkewer) {

    }

}
