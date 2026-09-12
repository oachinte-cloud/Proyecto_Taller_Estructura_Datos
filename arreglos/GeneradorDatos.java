package arreglos;

import java.util.Random;

public class GeneradorDatos {

    public static int[] generarArregloAleatorio(int tamano, int min, int max) {
        int[] arreglo = new int[tamano];
        Random aleatorio = new Random();
        
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = aleatorio.nextInt((max - min) + 1) + min;
        }
        
        return arreglo;
    }
}