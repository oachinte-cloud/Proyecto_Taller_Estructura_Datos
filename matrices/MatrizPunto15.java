package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizPunto15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;
        int n = 0;

        // Validación: Se requieren al menos 2 filas para ejecutar el intercambio
        while (m < 2) {
            System.out.print("Ingrese el número de filas m (m >= 2): ");
            m = scanner.nextInt();
            if (m < 2) {
                System.out.println("❌ Se necesitan al menos 2 filas para intercambiar la fila 0 y 1.");
            }
        }

        System.out.print("Ingrese el número de columnas (n): ");
        n = scanner.nextInt();

        // Generar e imprimir matriz inicial
        int[][] matriz = generarMatrizAleatoria(m, n, 10, 99);
        System.out.println("\n--- Matriz Original (" + m + "x" + n + ") ---");
        imprimirMatriz(matriz);

        // Intercambio O(1) de la fila 0 con la fila 1
        intercambiarFilas(matriz, 0, 1);

        System.out.println("\n--- Matriz Resultante (Fila 0 <-> Fila 1) ---");
        imprimirMatriz(matriz);

        scanner.close();
    }

    /**
     * Genera una matriz rellenada con aleatorios.
     */
    public static int[][] generarMatrizAleatoria(int m, int n, int min, int max) {
        int[][] matriz = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt((max - min) + 1) + min;
            }
        }
        return matriz;
    }

    /**
     * Intercambia dos filas mediante sus referencias en memoria.
     * Complejidad Temporal: O(1)
     */
    public static void intercambiarFilas(int[][] matriz, int filaA, int filaB) {
        int[] temp = matriz[filaA];
        matriz[filaA] = matriz[filaB];
        matriz[filaB] = temp;
    }

    /**
     * Imprime la matriz en consola.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%2d ] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}