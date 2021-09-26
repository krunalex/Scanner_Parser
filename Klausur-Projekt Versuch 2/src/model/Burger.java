package model;

public class Burger extends Food {

    private int burgerAnzahl;

    public Burger(){
        burgerAnzahl = 3;
    }

    @Override
    public void eat(){ // Polymorphie
        burgerAnzahl = burgerAnzahl - 1;
        System.out.println("Ich esse den Burger mit Händen und habe noch " + burgerAnzahl + " Burger übrig :(");
    }

    public void bestellen(){
        System.out.println("Ich möchte einen Burger bestellen!");
    }

}
