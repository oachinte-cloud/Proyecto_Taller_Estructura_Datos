package arreglos;

public class ArregloPunto5 {

    public static void main(String[] args) {
        
        int n = 20;
        
        // 1. Inicializamos el arreglo original con números aleatorios (ej. 1 a 100)
        int[] arregloOriginal = GeneradorDatos.generarArregloAleatorio(n, 1, 100);
        
        // 2. Creamos el segundo arreglo que almacenará el orden invertido
        int[] arregloInvertido = new int[n];
        
        // 3. Lógica de inversión de orden
        // 'i' recorre el original hacia adelante (0 a 19)
        // 'j' controla el invertido hacia atrás (19 a 0)
        int j = n - 1; 
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloInvertido[j] = arregloOriginal[i];
            j--; // Retrocedemos el puntero del segundo arreglo
        }
        
        // 4. Imprimimos ambos arreglos
        ImpresorArreglos.imprimirEnUnaLinea(arregloOriginal, "Arreglo Original");
        ImpresorArreglos.imprimirEnUnaLinea(arregloInvertido, "Arreglo Invertido");
        
        /* 
         * Nota: Si tu profesor se refería a invertir los DÍGITOS de cada número 
         * (ej. 123 -> 321) en lugar del orden del arreglo, avísame y cambiamos 
         * la lógica matemática del ciclo.
         */
    }
}