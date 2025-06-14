package basic.c08_oop;

public class Rectangle {
    int width;
    int length;
    int area;
    int perimeter;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
        this.area = length * width;
        this.perimeter = (length + width) * 2;
    }

    public void showArea(){
        System.out.println("The area of this rectangle is: " + area);
    }

    public void showPerimeter(){
        System.out.println("The perimeter of this rectangle is: " + perimeter);
    }
}
