package pizzaprojekt.model.people;

public class Guest extends Human {

    private String username;
    private String password;
    private String favoriteFood;
    private double budget; // Todo: In der App sein Budget angeben
    private String[][] orders;
    private String[] lastTenOrders = new String[10];
    int i = 0;

    public Guest(){
        this.username = username;
        this.password = password;
        this.favoriteFood = favoriteFood;
        this.budget = budget;
    }

    public void register(){
    }

    public void login() {
    }

    public void doOrder(int Meal, int Type){
        orders = new String[4][2];
        orders[0][0] = "Doener ohne alles ";
        orders[0][1] = "Doener mit alles ";
        orders[1][0] = "Pizza Magarita ";
        orders[1][1] = "Thunfischpizza";
        orders[2][0] = "Salat ";
        orders[2][1] = "Salat ohne Kaese ";
        orders[3][0] = "Wasser";
        System.out.println("Ich will " + orders[Meal][Type] + "haben");
        if(i<10){
            lastTenOrders[i] = orders[Meal][Type];
            i++;
        }else{
            i = 0;
            lastTenOrders[i] = orders[Meal][Type];
        }
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double Budget){
        this.budget = budget;
    }
}
