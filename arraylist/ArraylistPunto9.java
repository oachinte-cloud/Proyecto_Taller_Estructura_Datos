package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArraylistPunto9 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        
        // 1. Generamos los 20 números aleatorios entre 1 y 100
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }
        System.out.println("--- 1. Lista Original ---");
        System.out.println(numeros);
        
        // 2. Ordenamos de menor a mayor (Ascendente)
        // Usamos la clase Collections que implementa Timsort O(N log N)
        Collections.sort(numeros);
        System.out.println("\n--- 2. Lista Ascendente ---");
        System.out.println(numeros);
        
        // 3. Ordenamos de mayor a menor (Descendente)
        // Le pasamos un modificador para invertir el orden natural
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("\n--- 3. Lista Descendente ---");
        System.out.println(numeros);
        
        // 4. Separamos en pares e impares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        
        // Usamos un ciclo "for-each" para recorrer la lista de forma más limpia
        for (int numeroActual : numeros) {
            if (numeroActual % 2 == 0) {
                pares.add(numeroActual); // Va a la caja de pares
            } else {
                impares.add(numeroActual); // Va a la caja de impares
            }
        }
        
        // 5. Imprimimos las listas resultantes
        System.out.println("\n--- 4. Listas Separadas ---");
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}