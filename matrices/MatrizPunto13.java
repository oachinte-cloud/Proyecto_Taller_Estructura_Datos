package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizPunto13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();

        // Rango de aleatorios pequeños (1 a 5) para aumentar la posibilidad de encontrar coincidencias
        int[][] matriz = generarMatrizAleatoria(n, 1, 5);
        
        System.out.println("\n--- Matriz Generada ---");
        imprimirMatriz(matriz);

        // 1. Imprimir las 4 esquinas
        imprimirEsquinas(matriz, n);

        // 2. Determinar simetría
        boolean simetrica = esSimetrica(matriz, n);
        if (simetrica) {
            System.out.println("\n✅ La matriz ES simétrica.");
        } else {
            System.out.println("\n❌ La matriz NO es simétrica.");
        }

        scanner.close();
    }

    public static int[][] generarMatrizAleatoria(int n, int min, int max) {
        int[][] matriz = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt((max - min) + 1) + min;
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d ] ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Muestra las 4 esquinas de la matriz.
     * Complejidad: O(1)
     */
    public static void imprimirEsquinas(int[][] matriz, int n) {
        System.out.println("\n--- Esquinas de la Matriz ---");
        System.out.println("Superior Izquierda (0, 0): " + matriz[0][0]);
        System.out.println("Superior Derecha   (0, " + (n - 1) + "): " + matriz[0][n - 1]);
        System.out.println("Inferior Izquierda (" + (n - 1) + ", 0): " + matriz[n - 1][0]);
        System.out.println("Inferior Derecha   (" + (n - 1) + ", " + (n - 1) + "): " + matriz[n - 1][n - 1]);
    }

    /**
     * Evalúa si una matriz es simétrica.
     * Optimizado: evalúa solo las casillas j > i (triángulo superior).
     * Complejidad: O(n^2)
     */
    public static boolean esSimetrica(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // Falla inmediata si no coinciden
                }
            }
        }
        return true;
    }
}