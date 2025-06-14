package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Josue");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Age: 25\nFavorite Color: Blue\nCity: Santo Dominigo");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.console().printf("Explorando diferentes métodos de impresión.\n");
        System.err.println("Este es un mensaje de error (System.err.println)."); 

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("this is");
        System.out.println("a test of");
        System.out.println("multiple println statements.");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("😁");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}