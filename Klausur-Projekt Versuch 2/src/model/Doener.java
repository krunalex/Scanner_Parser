package model;

public class Doener extends Food {

    public Doener(){
    }

    public void eat() { // Polymorphie
        System.out.println("Diese Zeile beweist dass Typecast funktioniert hat. Ich gehe jetzt aus dem Fenster springen.");
    }

}
