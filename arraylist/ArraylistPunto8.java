package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistPunto8 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        
        // 1. Generamos los 100 números aleatorios entre 1 y 20
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(20) + 1);
        }
        
        /* 
         * 2. Creamos nuestro "pizarrón" de frecuencias.
         * Lo hacemos de tamaño 21 para que el índice coincida exactamente 
         * con el número (índices del 0 al 20). Ignoraremos el índice 0.
         */
        int[] frecuencias = new int[21];
        
        // Recorremos la lista y sumamos 1 en la posición correspondiente al número
        for (int i = 0; i < numeros.size(); i++) {
            int numeroActual = numeros.get(i);
            frecuencias[numeroActual]++; // Dibujamos "un palito" en el pizarrón
        }
        
        // 3. Imprimimos la tabla y buscamos el más frecuente al mismo tiempo
        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;
        
        System.out.println("--- Tabla de Frecuencias ---");
        System.out.println("Número\t|\tApariciones");
        System.out.println("----------------------------");
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("  " + i + "\t|\t    " + frecuencias[i]);
            
            // Si la frecuencia actual supera a la máxima registrada, actualizamos
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasFrecuente = i;
            }
        }
        
        // 4. Resultado final
        System.out.println("----------------------------");
        System.out.println("El número que más se repite es el " + numeroMasFrecuente + 
                           " (Apareció " + maxFrecuencia + " veces).");
    }
}