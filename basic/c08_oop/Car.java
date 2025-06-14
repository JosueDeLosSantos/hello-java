package basic.c08_oop;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.println("Brand: "+ brand + " Model: "+ model);
    }
}
