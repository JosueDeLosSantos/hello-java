package basic.c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Clase 4 - Listas, Sets y Mapas (31/04/2025)
Vídeo: https://www.twitch.tv/videos/2447254597
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Eve"};
        System.out.println("Longitud del Array: " + names.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(names[0]);
        names[0] = "Alison";
        System.out.println(names[0]);
        // 3. Crea un ArrayList vacío.
        var ages = new ArrayList<Integer>();
        System.out.println(ages.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        ages.add(25);
        ages.add(30);
        ages.add(35);
        ages.add(40);
        System.out.println("Tamaño del ArrayList antes de eliminar: " + ages.size());
        ages.remove(2); // Elimina el valor 35
        System.out.println("Tamaño del ArrayList después de eliminar: " + ages.size());

        // 5. Crea un HashSet con 2 valores diferentes.
        var kids = new HashSet<Integer>();
        kids.add(5);
        kids.add(10);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        kids.add(5); // Valor repetido
        kids.add(15); // Valor no repetido
        System.out.println("HashSet después de añadir valores: " + kids);

        // 7. Elimina uno de los elementos del HashSet.
        kids.remove(10);
        System.out.println("HashSet después de eliminar un elemento: " + kids);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contacts = new HashMap<String, Integer>();
        contacts.put("Alice", 123456789);
        contacts.put("Bob", 987654321);
        contacts.put("Charlie", 555123456);
        System.out.println("Contactos: " + contacts);

        // 9. Modifica uno de los contactos y elimina otro.
        contacts.replace("Alice", 111222333); // Modifica el número de Alice
        contacts.remove("Bob"); // Elimina a Bob
        System.out.println("Contactos después de modificaciones: " + contacts);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        var newArrayList = new ArrayList<String>();
        for (String name : names) {
            newArrayList.add(name);
        }
        System.out.println("ArrayList: " + newArrayList);

        var newHashSet = new HashSet<String>(newArrayList);
        System.out.println("HashSet: " + newHashSet);

        var newHashMap = new HashMap<String, String>();
        for(String name : newHashSet){
            newHashMap.put(name, name);
        }
        System.out.println("HashMap: " + newHashMap);
    }
}
