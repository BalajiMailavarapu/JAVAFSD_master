package Day19;

public class BankApp {

    private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
    }
    
    public String deposited(double amount) {

        if(amount > 0) {
            return "Deposit Success";
        }

        return "Invalid Amount";
    }

    public double getBalance() {
        return balance;
    }
}