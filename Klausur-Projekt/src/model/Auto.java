package model;

public class Auto extends Fahrzeug{

    public Auto(){
        geschwindigkeit = 50;
    }

    public int berechneAutoStrecke(){
        verbleibendeStrecke = verbleibendeStrecke - geschwindigkeit;
        return verbleibendeStrecke;
    }

    public boolean driften(){
        zufaelligeZahl();
        if (zufaelligeZahl()<5){
            return false;
        }else{
            return true;
        }
    }
}
