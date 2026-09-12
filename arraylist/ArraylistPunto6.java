package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistPunto6 {

    public static void main(String[] args) {
        
        // 1. Inicializamos nuestra estructura dinámica (el tren)
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        
        int numeroGenerado;
        int suma = 0;
        
        // 2. Ciclo de generación hasta encontrar el 10
        System.out.println("Generando números...");
        do {
            // Generamos un número entre -10 y 10
            numeroGenerado = random.nextInt(21) - 10; 
            
            // Añadimos el número al final de la lista
            numeros.add(numeroGenerado);
            
            // Vamos acumulando la suma en tiempo real
            suma = suma + numeroGenerado;
            
        } while (numeroGenerado != 10); // El ciclo se rompe al leer el 10
        
        // 3. Calculamos la media (promedio)
        double media = (double) suma / numeros.size();
        
        // 4. Imprimimos los resultados
        System.out.println("Números leídos: " + numeros);
        System.out.println("Cantidad de números: " + numeros.size());
        System.out.println("Suma total: " + suma);
        System.out.println("Media (Promedio): " + media);
    }
}