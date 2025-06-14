package basic.c08_oop;

public class Product {
    String name;
    int prize;

    public Product(String name, int prize){
        this.name = name;
        this.prize = prize;
    }

    public void discount(int amount){
        this.prize -= amount;
        System.out.println("A discount of " + amount + " has been applied.");
        System.out.println("The new prize is: " + prize);
    }
}
