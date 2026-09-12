package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPunto7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Inicializamos y llenamos con los primeros 20 pares (O(N) Temporal)
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            pares.add(i * 2); 
        }
        
        System.out.println("--- Lista Inicial ---");
        System.out.println(pares);
        
        // 2. Inserción manteniendo el orden (O(N) Temporal)
        System.out.print("\nIngresa un número para insertar en orden: ");
        int numeroAInsertar = scanner.nextInt();
        
        boolean insertado = false;
        for (int i = 0; i < pares.size(); i++) {
            // Buscamos el primer número mayor al que queremos insertar
            if (numeroAInsertar < pares.get(i)) {
                pares.add(i, numeroAInsertar); // Java hace el desplazamiento automáticamente
                insertado = true;
                break; 
            }
        }
        // Si es mayor que todos, va al final (O(1) amortizado)
        if (!insertado) {
            pares.add(numeroAInsertar);
        }
        
        System.out.println("Lista tras la inserción: ");
        System.out.println(pares);
        
        // 3. Eliminación solicitada al usuario (O(N) Temporal)
        System.out.print("\nIngresa el valor exacto que deseas borrar: ");
        int valorBorrar = scanner.nextInt();
        
        // Usamos Integer.valueOf() para borrar por OBJETO (valor) y no por ÍNDICE
        boolean seBorro = pares.remove(Integer.valueOf(valorBorrar));
        
        if (seBorro) {
            System.out.println("Valor eliminado. Java desplazó los elementos a la izquierda.");
        } else {
            System.out.println("El valor no se encontró en la lista.");
        }
        
        System.out.println("Lista final: ");
        System.out.println(pares);
        
        scanner.close();
    }
}