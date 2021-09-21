package pizzaprojekt.model.food;

import pizzaprojekt.model.tools.KebabSkewer;

public class Kebab extends MenuCard {

    private KebabSkewer kebabSkewer;
    public Kebab(KebabSkewer kebabSkewer){

    }
    @Override
    public void use() {
        kebabSkewer.useSkewer();
    }

}

