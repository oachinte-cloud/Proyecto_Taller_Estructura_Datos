package matrices;

public class MatrizPunto14 {

    public static void main(String[] args) {
        // Matriz de m x n inicializada de manera predeterminada (2 filas x 3 columnas)
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int m = matrizOriginal.length;       // Filas = 2
        int n = matrizOriginal[0].length;    // Columnas = 3

        System.out.println("--- Matriz Inicial (" + m + "x" + n + ") ---");
        imprimirMatriz(matrizOriginal);

        // Obtención de la matriz transpuesta (3x2)
        int[][] matrizTranspuesta = obtenerTranspuesta(matrizOriginal, m, n);

        System.out.println("\n--- Matriz Transpuesta (" + n + "x" + m + ") ---");
        imprimirMatriz(matrizTranspuesta);
    }

    /**
     * Construye la matriz transpuesta invirtiendo los índices de fila y columna.
     * Complejidad Temporal: O(m * n)
     * Complejidad Espacial: O(m * n)
     */
    public static int[][] obtenerTranspuesta(int[][] matriz, int m, int n) {
        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    /**
     * Imprime una matriz bidimensional con formato ordenado.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d ] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}