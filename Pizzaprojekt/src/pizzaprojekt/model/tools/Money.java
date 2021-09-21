package pizzaprojekt.model.tools;

public class Money {
    int balance=0;
    public Money(){
        
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int price) {
        balance = balance+price;
    }
}
