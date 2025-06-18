package basic.c08_oop.access_modifiers;

public class Product {
    private double price = 0;
    
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Price should be greater than 0");
        }
    }

    public double getPrice(){
        return price;
    }
}
