package basic.c08_oop.access_modifiers;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person();
        person.setName("josh");
        person.setAge(23);
        System.out.println("Person's name is " + person.getName() + " and Person's age is " + person.getAge());
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product();
        product.setPrice(60.50);
        System.out.println("The product's price is " + product.getPrice());
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var account = new BankAccount();
        account.deposit(50.50);
        account.withdraw(30.50);
        System.out.println("Your current balance is " + account.getTitle());
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book();
        book.setTitle("My great title");
        System.out.println("The book's title is " + book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature();
        temperature.setCelsius(20.30);
        System.out.println("The temperature is " + temperature.getTemperature() + " celsius!🌡");

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User();
        user.setUsername("JoshCoder");
        user.setPassword("mypassword");
        user.checkPassword("mypassword");
        user.getInfo();

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }
}
