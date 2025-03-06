package T06.Taquilla;

public class Taquilla {
    public int entradasDisponibles;
    public int maxEntradaLlevada;
    public int cantidadEntradasLimite;
    
    public Taquilla(int entradasDisponibles, int cantidadEntradasLimite) {
        this.entradasDisponibles = entradasDisponibles;
        this.maxEntradaLlevada = 0;
        this.cantidadEntradasLimite = cantidadEntradasLimite;
    }
    public boolean comprarEntradas (int nE) {
        if (nE > this.entradasDisponibles) return false;
        if (nE > this.cantidadEntradasLimite) return false;
        this.entradasDisponibles -= nE;
        if (nE > this.maxEntradaLlevada) this.maxEntradaLlevada = nE;
        return true;
    }
    public boolean hayEntradas () {
        return this.entradasDisponibles > 0;
    }
    
}
