package arreglos;

public class ArregloPunto2 {

    public static void main(String[] args) {
        
        // 1. Asignamos la memoria para los 100 casilleros (O(N) Espacial)
        int[] numerosPares = new int[100];
        
        // 2. Recorremos el arreglo para llenarlo por programa (O(N) Temporal)
        for (int i = 0; i < numerosPares.length; i++) {
            
            // EL RETO MATEMÁTICO: ¿Cuál es la fórmula usando 'i'?
            numerosPares[i] = (i * 2) + 2; // Esto genera los primeros 100 números pares: 2, 4, 6, ..., 200
            
        }
        
        // 3. Usamos nuestra "Caja de Herramientas" para imprimir[cite: 1]
        System.out.println("--- Impresión en una sola línea ---");
        ImpresorArreglos.imprimirEnUnaLinea(numerosPares, "Pares");
        
        System.out.println("\n--- Impresión indicando número de línea ---");
        ImpresorArreglos.imprimirEnVariasLineas(numerosPares, 10);
    }
}