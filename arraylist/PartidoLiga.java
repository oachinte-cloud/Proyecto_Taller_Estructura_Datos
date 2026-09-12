package arraylist;

public class PartidoLiga {
    // Estas son las "casillas" de nuestro molde
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    // Este es el constructor (la máquina que inyecta la arena en el molde)
    public PartidoLiga(String local, String visitante, int gLocal, int gVisitante) {
        this.equipoLocal = local;
        this.equipoVisitante = visitante;
        this.golesLocal = gLocal;
        this.golesVisitante = gVisitante;
    }

    // Estos métodos nos dan acceso rápido O(1) a los datos
    public String getEquipoLocal() { return equipoLocal; }
    public String getEquipoVisitante() { return equipoVisitante; }
    public int getGolesLocal() { return golesLocal; }
    public int getGolesVisitante() { return golesVisitante; }

    @Override
    public String toString() {
        return equipoLocal + " (" + golesLocal + ") vs (" + golesVisitante + ") " + equipoVisitante;
    }
}