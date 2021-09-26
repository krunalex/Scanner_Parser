package model;

public abstract class Food { // Abstrakte Klasse
    protected int UserMoney;

    public Food(){

}

    public void pay(int UserMoney){  // Überladen
        UserMoney = UserMoney - 10;
    }

    public boolean pay(){ // Überladen
        if(UserMoney < 0){
            System.out.println("Ich habe kein Geld!");
        }
        return false;
    }

    public void eat(){
        System.out.println("Ich esse etwas.");
    }

    public abstract void bestellen();

}
