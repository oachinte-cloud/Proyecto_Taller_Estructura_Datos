package arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPunto10 {

    public static void main(String[] args) {
        ArrayList<PartidoLiga> partidos = new ArrayList<>();
        
        // 1. LECTURA DEL ARCHIVO DE TEXTO
        try {
            // Busca el archivo en la raíz del proyecto
            File archivo = new File("PartidoLiga.txt");
            Scanner lectorArchivo = new Scanner(archivo);
            
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                String[] datos = linea.split("::"); // Separamos por las comas
                
                // Convertimos el texto a números y creamos el objeto Partido
                String local = datos[0];
                String visitante = datos[1];
                int gLocal = Integer.parseInt(datos[2]);
                int gVisita = Integer.parseInt(datos[3]);
                
                partidos.add(new PartidoLiga(local, visitante, gLocal, gVisita));
            }
            lectorArchivo.close();
            System.out.println("Base de datos cargada correctamente. Total partidos: " + partidos.size() + "\n");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo 'partidos.txt'. Asegúrate de ponerlo en la raíz del proyecto.");
            return; // Detenemos la ejecución si no hay base de datos
        }

        // REQUERIMIENTO A: Mostrar partidos donde el visitante fue ganador
        System.out.println("--- Partidos ganados por el Visitante ---");
        for (PartidoLiga p : partidos) {
            if (p.getGolesVisitante() > p.getGolesLocal()) {
                System.out.println(p);
            }
        }

        // REQUERIMIENTO B: Contar cuántas veces ganó el Barcelona
        int victoriasBarcelona = 0;
        for (PartidoLiga p : partidos) {
            boolean ganoComoLocal = p.getEquipoLocal().equals("Barcelona") && p.getGolesLocal() > p.getGolesVisitante();
            boolean ganoComoVisita = p.getEquipoVisitante().equals("Barcelona") && p.getGolesVisitante() > p.getGolesLocal();
            
            if (ganoComoLocal || ganoComoVisita) {
                victoriasBarcelona++;
            }
        }
        System.out.println("\n--- Estadísticas de Equipo ---");
        System.out.println("El Barcelona ganó " + victoriasBarcelona + " veces.");

        // REQUERIMIENTO D: Contar cuántos partidos ganó el equipo local 
        // (Lo hacemos ANTES de borrar datos para tener el conteo total real)
        int victoriasLocales = 0;
        for (PartidoLiga p : partidos) {
            if (p.getGolesLocal() > p.getGolesVisitante()) {
                victoriasLocales++;
            }
        }
        System.out.println("Los equipos locales ganaron un total de " + victoriasLocales + " partidos.");

        // REQUERIMIENTO C: Eliminar partidos cuyo resultado no sea empate (y mostrar)
        System.out.println("\n--- Limpieza: Dejando solo los empates ---");
        // Técnica Big-O(N): Recorremos hacia ATRÁS para evitar que el desplazamiento de índices arruine el ciclo
        for (int i = partidos.size() - 1; i >= 0; i--) {
            PartidoLiga p = partidos.get(i);
            // Si los goles son diferentes (no es empate), lo borramos
            if (p.getGolesLocal() != p.getGolesVisitante()) {
                partidos.remove(i);
            }
        }
        
        // Imprimimos la lista final que ahora solo contiene empates
        for (PartidoLiga p : partidos) {
            System.out.println(p);
        }
    }
}
