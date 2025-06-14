package basic.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        greetName("Josue");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        subtractor(5, 2);
        
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        numSquare(5);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        evenOrOdd(6);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        isAdult(15);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        stringLength("spectacular");

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] arrayOfNums = {50, 60, 70, 40, 20};
        arrayNumsAvg(arrayOfNums);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        factorialOf(5);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        var texts = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        printAll(texts);
    }

    public static void greetName(String name){
        System.out.println("Hola " + name);
    }

    public static void subtractor(int a, int b){
        System.out.println("The total is: " + (a - b));
    }

    public static void numSquare(int num){
        int SQUARE = (num * num);
        System.out.println("The square of " + num + " is " + SQUARE);
    }

    public static void evenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }

    public static void isAdult(int num){
        if(num > 17){
             System.out.println("is adult");
        } else {
             System.out.println("is under age");
        }
    }

    public static void stringLength(String text){
        int length = text.length();
        System.out.println("This text contains: " + length + " characters");
    }

    public static void arrayNumsAvg(int[] nums){
        int arrSum = 0;
        for (int num: nums){
            arrSum += num;
        }
        double result = arrSum / nums.length;
        System.out.println("The average of all the numbers is: " + result);
    }

    public static void factorialOf(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("The factorial of "+ num + " is " + result);
    }

    public static void printAll(ArrayList<String> textsArr){
        for (String text: textsArr){
            System.out.println(text);
        }
    }
}
