package arreglos;

public class CalculadoraFactoriales {
    public static long calcularFactorial(int numero) {
        long resultado = 1; 
        
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i; // ¡Tu lógica matemática aplicada!
        }
        
        return resultado;
    }
}