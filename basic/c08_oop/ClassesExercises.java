package basic.c08_oop;

import java.util.ArrayList;
import java.util.Arrays;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("The great book", "Josue de los santos");
        book.showData();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog("Powder", "Haw, haw, haw!");
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car("Toyota", "Camri");
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(61);
        student.promoded();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var account = new BankAccount(100);
        account.deposit(30);
        account.deposit(50);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(40, 60);
        rectangle.showArea();
        rectangle.showPerimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Jhon", 5000);
        worker.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var person1 = new Person("fulano1", 20, "1");
        var person2 = new Person("fulano2", 20, "2");
        var person3 = new Person("fulano3", 20, "3");

        var people = new ArrayList<Person>(Arrays.asList(person1, person2, person3));

        System.out.println(people.size());

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product("milk", 30);
        product.discount(5);
    }
}
