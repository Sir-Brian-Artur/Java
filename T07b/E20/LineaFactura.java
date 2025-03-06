package T07b.E20;

public class LineaFactura {
    String DescProd;
    double precioUnidad;
    int cantidadUnidades;
    int descuento;
    double impoteTotalLinea;

    LineaFactura(String DescProd, double precioUnidad, int cantidadUnidades){
        this.DescProd = DescProd;
        this.precioUnidad = precioUnidad;
        this.cantidadUnidades = cantidadUnidades;
        this.descuento = descuentoLinea();
        this.impoteTotalLinea = (this.cantidadUnidades * this.precioUnidad) * (100 - this.descuento) / 100;
    }

    private int descuentoLinea(){
        if(this.cantidadUnidades >= 10) return 5;
        return 0;
    }
}
