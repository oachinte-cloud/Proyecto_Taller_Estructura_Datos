package arreglos;

public class ArregloPunto1 {

    public int[] inicializarPrimos() {
        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    }
    public static void main(String[] args) {
        ArregloPunto1 ejercicio = new ArregloPunto1();
        
        // 1. Obtenemos los datos
        int[] primos = ejercicio.inicializarPrimos();
        
        // 2. Usamos nuestra Caja de Herramientas (El Altoparlante) para imprimir el arreglo
        // Fíjate que no usamos "new ImpresorArreglos()", lo llamamos directamente porque es 'static'.
        ImpresorArreglos.imprimirEnUnaLinea(primos, "Arreglo de primeros 10 primos");
    }
}