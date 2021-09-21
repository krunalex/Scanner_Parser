package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.Furnace;
import pizzaprojekt.model.tools.KebabSkewer;
import pizzaprojekt.model.tools.SaladStorage;

public class Kebab extends MenuCard {

    private KebabSkewer kebabSkewer;
    public Kebab(KebabSkewer kebabSkewer){
        use(kebabSkewer);
    }

    @Override
    public void use(KebabSkewer kebabSkewer) {
        kebabSkewer.useSkewer();
    }

    @Override
    public void use(Furnace furnace) {

    }

    @Override
    public void use(SaladStorage saladStorage) {

    }



}

