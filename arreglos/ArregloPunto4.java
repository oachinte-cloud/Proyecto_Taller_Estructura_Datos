package arreglos;

public class ArregloPunto4 {

    public static void main(String[] args) {
        
        // Generamos los 25 números aleatorios entre -50 y 50
        int[] numeros = GeneradorDatos.generarArregloAleatorio(25, -50, 50);
        
        // Inicializamos asumiendo que el primer número es tanto el mayor como el menor
        int numeroMenor = numeros[0];
        int numeroMayor = numeros[0];
        
        // Empezamos el ciclo desde la posición 1 (porque ya evaluamos la 0)
        for (int i = 1; i < numeros.length; i++) {
            
            // Si el número actual es menor que nuestro registro, lo actualizamos
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
            
            // Si el número actual es mayor que nuestro registro, lo actualizamos
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        
        // Imprimimos los resultados
        ImpresorArreglos.imprimirEnUnaLinea(numeros, "Arreglo de 25 números (-50 a 50)");
        System.out.println("El número menor encontrado es: " + numeroMenor);
        System.out.println("El número mayor encontrado es: " + numeroMayor);
    }
}