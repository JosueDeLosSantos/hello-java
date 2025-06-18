package basic.c08_oop.access_modifiers;

public class BankAccount {
    private double balance = 0;

    

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        } else {
            System.out.println("Amount should be greater than 0");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount < balance){
            this.balance -= amount;
        } else if (amount > 0 && amount > balance) {
            System.out.println("Your balance is less than " + amount);
        }else {
            System.out.println("Amount should be greater than 0");
        }
    }

    public double getTitle(){
        return balance;
    }

    
}
