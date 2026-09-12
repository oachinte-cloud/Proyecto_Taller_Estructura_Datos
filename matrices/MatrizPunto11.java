package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizPunto11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        // 2. Generar e imprimir la matriz
        int[][] matriz = generarMatrizAleatoria(m, n, 1, 50); // Números entre 1 y 50
        System.out.println("\n--- Matriz Generada ---");
        imprimirMatriz(matriz);

        // 3. Solicitar el número a buscar
        System.out.print("\nIngrese el número entero que desea buscar: ");
        int numeroBuscado = scanner.nextInt();

        // 4. Procesar la búsqueda
        buscarPrimeraOcurrencia(matriz, numeroBuscado);

        scanner.close();
    }

    /**
     * Genera una matriz rellenada con números aleatorios.
     */
    public static int[][] generarMatrizAleatoria(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Genera número aleatorio en el rango [min, max]
                matriz[i][j] = random.nextInt((max - min) + 1) + min; 
            }
        }
        return matriz;
    }

    /**
     * Imprime la matriz con un formato alineado.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d ] ", matriz[i][j]);
            }
            System.out.println(); // Salto de línea por cada fila
        }
    }

    /**
     * Busca la primera ocurrencia de un número en la matriz.
     * Complejidad: O(m * n)
     */
    public static void buscarPrimeraOcurrencia(int[][] matriz, int objetivo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                // Condición de búsqueda
                if (matriz[i][j] == objetivo) {
                    System.out.println("✅ El número " + objetivo + " fue encontrado por PRIMERA vez en:");
                    System.out.println("Fila: " + i + ", Columna: " + j);
                    
                    // Al usar 'return', el método termina inmediatamente.
                    // Esto evita que siga buscando e imprimiendo otras ocurrencias.
                    return; 
                }
            }
        }
        // Si el ciclo termina y nunca entró al 'if', significa que no existe.
        System.out.println("❌ El número " + objetivo + " NO se encuentra en la matriz.");
    }
}