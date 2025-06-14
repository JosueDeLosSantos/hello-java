package basic.c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while(index < 11){
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        String[] randomNames = {"jhon", "jana", "peter", "marc"};
        var myList = new ArrayList<String>();
        for(String rnames: randomNames){
            myList.add(rnames);
        }
        int temp = 0;
        do {
            System.out.println(myList.get(temp));
            temp++;
        } while(temp < myList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for(int i = 1; i < 51; i++){
            int multiplo = 5 * i;
            if (multiplo > 50) {
                break; // Detiene el bucle si el múltiplo supera 50
            }
            System.out.println(multiplo);
        }
        
      

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 2, 3, 4, 5};
        int sumaTotal = 0;
        for(int i = 0; i < numbers.length; i++){
            
            sumaTotal += numbers[i];
            if(i == numbers.length - 1){
                System.out.println("la suma total es: " + sumaTotal);
            }
        }

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for(int number: numbers){
            System.out.println(number);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        var mySet = new HashSet<String>();
        for( Map.Entry<Integer, String> num: myMap.entrySet()){
            mySet.add(num.getValue());
        }

        for(String nums: mySet){
            System.out.println(nums);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue; // Salta los múltiplos de 3
            }
            System.out.println(i);
        }
    

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[]  mixedNumbers = {1, 2, -3, 4};
        for (int i: mixedNumbers){
            if(i < 0){
                break;
            }
            System.out.println(i);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int number = 5; // Cambia este valor para calcular el factorial de otro número
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + number + " es: " + factorial); 
    }
}
