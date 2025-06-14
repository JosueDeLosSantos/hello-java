package basic.c08_oop;

public class Book {
    
    String title;
    String author;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void showData(){
        System.out.println(title + " by " + author);
    }
}
