package model;

public class Motorrad extends Fahrzeug{

    public Motorrad(){
        geschwindigkeit = 100;
    }

    public int berechneMotorradStrecke(){
        verbleibendeStrecke = verbleibendeStrecke - geschwindigkeit;
        return verbleibendeStrecke;
    }

    public boolean macheWheelie(){
        zufaelligeZahl();
        if (zufaelligeZahl()<5){
            return false;
        }else{
            return true;
        }
    }
}
