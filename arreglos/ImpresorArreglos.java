package arreglos;

public class ImpresorArreglos {

    /**
     * Imprime todos los elementos del arreglo en una sola línea.
     * Complejidad Temporal: O(N) | Complejidad Espacial: O(1)
     */
    public static void imprimirEnUnaLinea(int[] arreglo, String titulo) {
        System.out.print(titulo + ": [ ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            // Solo imprimimos la coma si no es el último elemento
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Imprime el arreglo separándolo en varias líneas, indicando el número de línea.
     * @param arreglo El arreglo a imprimir.
     * @param elementosPorLinea Cuántos números queremos imprimir antes de dar un salto (Ej: 10).
     */
    public static void imprimirEnVariasLineas(int[] arreglo, int elementosPorLinea) {
        int numeroLinea = 1; // Contador para saber en qué línea vamos
        
        System.out.print("Línea " + numeroLinea + ": ");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t"); // \t es un tabulador para que se vea alineado
            
            // Reto socrático resuelto: Usamos el operador módulo (%)
            // Si la cantidad de elementos impresos es múltiplo de 'elementosPorLinea', saltamos.
            if ((i + 1) % elementosPorLinea == 0 && (i + 1) != arreglo.length) {
                System.out.println(); // Salto de línea
                numeroLinea++; // Aumentamos el contador de línea
                System.out.print("Línea " + numeroLinea + ": "); // Preparamos la siguiente
            }
        }
        System.out.println(); // Salto de línea final para que la consola no quede pegada
    }
}