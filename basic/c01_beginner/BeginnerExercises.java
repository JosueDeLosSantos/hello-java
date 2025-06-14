package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Josue";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 30;
        System.out.println(myAge);

        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.75;
        System.out.println(myHeight);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likesProgramming = true;
        System.out.println(likesProgramming);

        // 5. Declara una constante con tu email.
        final String MY_EMAIL = "myemail@email.com";
        System.out.println(MY_EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'J';
        System.out.println(myInitial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        var myCity = "Madrid";
        System.out.println(myCity);
        myCity = "Barcelona";
        System.out.println(myCity);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 10;
        System.out.println("Suma de a y b: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de a: " + ((Object)a).getClass().getSimpleName());
        System.out.println("Tipo de b: " + ((Object)b).getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int uninitializedVariable;
        uninitializedVariable = 42; // Asignación antes de imprimir
        System.out.println("Variable sin inicializar: " + uninitializedVariable);
    }
}
