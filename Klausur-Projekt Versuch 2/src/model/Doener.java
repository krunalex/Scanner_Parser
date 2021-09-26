package model;

public class Doener extends Food {

    public Doener(){
    }

    @Override
    public void eat() { // Polymorphie
        System.out.println("Diese Zeile beweist dass Typecast funktioniert hat. Ich gehe jetzt aus dem Fenster springen.");
    }

    public void bestellen(){
        System.out.println("Ich möchte einen Döner bestellen!");
    }

}
