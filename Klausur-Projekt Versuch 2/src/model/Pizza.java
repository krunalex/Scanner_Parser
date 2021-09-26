package model;

public class Pizza extends Food {

    public Pizza(){
    }

    @Override
    public void eat(){ // Polymorphie
        System.out.println("Ich esse die Pizza mit Gabel und Messer!");
    }

    public void bestellen(){
        System.out.println("Ich möchte eine Pizza bestellen!");
    }

}
