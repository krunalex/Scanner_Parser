package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.SaladStorage;

public class Salad extends MenuCard {

    private SaladStorage saladStorage;
    public Salad(SaladStorage saladStorage){

    }


    @Override
    public void use() {
        saladStorage.makeSalad();
    }

}
