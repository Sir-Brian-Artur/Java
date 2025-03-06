package T07b.E20;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    int numIdent;
    LocalDate fecha;
    int numClient;
    int IVA = 21;
    double importeTotalFactura;
    ArrayList <LineaFactura> lineaFactura;

    Factura(){
        this.importeTotalFactura = 0;
        this.fecha = LocalDate.now();
        lineaFactura = new ArrayList<>();
    }eeeeee

    void añadirLinea(){
        lineaFactura.add(null);
    }

    void eliminarLinea(){
        lineaFactura.remove(0);
    }

    void mostrarFactura(){

    }

}
