package basic.c08_oop;

public class Student {
    int score;

    public Student(int score){
        this.score = score;
    }

    public void promoded(){
        if(score >= 60){
            System.out.println("This student was promoted");
        } else {
            System.out.println("This student was not promoted");
        }
    }
}
