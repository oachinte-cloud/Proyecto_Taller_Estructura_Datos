package arreglos;

public class ArregloPunto3 {

    public static void main(String[] args) {
        
        int[] arregloIniciales = GeneradorDatos.generarArregloAleatorio(20, 1, 10);
        long[] factoriales = new long[20];
        for (int i = 0; i < 20; i++) {
            // AQUÍ ESTÁ LA MAGIA:
            // Tomamos el dato específico (numerosIniciales[i]), se lo pasamos a la máquina 
            // (CalculadoraFactoriales.calcularFactorial) y guardamos la respuesta (factoriales[i]).
            factoriales[i] = CalculadoraFactoriales.calcularFactorial(arregloIniciales[i]);
        }
   // 4. Estación de Control de Calidad (Impresión)[cite: 1]
        System.out.println("--- Resultados del Punto 3 ---");
        ImpresorArreglos.imprimirEnUnaLinea(arregloIniciales, "Números Originales");
        
        /* 
         * Nota Técnica: Como 'factoriales' es un arreglo de tipo long[], 
         * si tu clase ImpresorArreglos solo recibe int[], tendrás que crearle 
         * un método sobrecargado (mismo nombre, diferente parámetro) para long[].
         * Por ahora, lo imprimimos directamente aquí para completar el ejercicio:
         */
        System.out.print("Factoriales calculados: [ ");
        for (int i = 0; i < 20; i++) {
            System.out.print(factoriales[i] + (i < 20 - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}