package model;

public abstract class Fahrzeug {

    protected int geschwindigkeit;
    protected int verbleibendeStrecke;

    public Fahrzeug(){
        verbleibendeStrecke = 200;
    }

    public int zufaelligeZahl(){
        int random_int = (int)Math.floor(Math.random()*(10-1+1)+1);
        return random_int;
    }
}
