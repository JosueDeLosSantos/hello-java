package basic.c08_oop;

public class BankAccount {
    int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Yout new balance is " + balance);
    }
}
