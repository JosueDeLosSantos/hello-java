package basic.c08_oop;

public class Dog {
    String race;
    String sound;

    public Dog (String race, String sound){
        this.race = race;
        this.sound = sound;
    }

    public void bark(){
        System.out.println("The "+ race + " say "+ sound);
    }
}
