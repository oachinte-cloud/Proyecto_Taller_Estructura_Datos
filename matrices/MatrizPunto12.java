package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizPunto12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();

        int[][] matriz = generarMatriz(n);
        System.out.println("\n--- Matriz Generada ---");
        imprimirMatriz(matriz);

        int suma = sumarDiagonalSecundaria(matriz, n);
        System.out.println("\nLa sumatoria de la diagonal secundaria es: " + suma);
        
        scanner.close();
    }

    public static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Números aleatorios entre -50 y 50
                matriz[i][j] = random.nextInt(101) - 50; 
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%4d ] ", matriz[i][j]);
            }
            System.out.println();
        }
    }

   public static int sumarDiagonalSecundaria(int[][] matriz, int n) {
    int sumatoria = 0;
    
    // Un solo ciclo para lograr complejidad O(n)
    for (int i = 0; i < n; i++) {
        sumatoria += matriz[i][n - 1 - i]; 
    }
    
    return sumatoria;
}
}