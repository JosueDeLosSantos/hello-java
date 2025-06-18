package basic.c08_oop.access_modifiers;

public class Temperature {
    private double celsius;

    public void setCelsius(double celsius){
        if (celsius > -100 && celsius < 101){
            this.celsius = celsius;
        } else {
            System.out.println("The temperature " + celsius + " is not within the allowed celsius range");
        }
    }

    public double getTemperature(){
        return celsius;
    }
    
}
