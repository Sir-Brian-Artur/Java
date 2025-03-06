package T07b.E19;

public class Producto {
    private int codProd, cant;
    private String desProd;
    private double precUd, precTtl;

    public Producto(int codProd, String desProd, double precUd, int cant){
        this.codProd = codProd;
        this.desProd = desProd;
        this.precUd = precUd;
        this.cant = cant;
        this.precTtl = this.precUd * this.cant;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCodProd() {
        return codProd;
    }
    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDesProd() {
        return desProd;
    }
    public void setDesProd(String desProd) {
        this.desProd = desProd;
    }

    public double getPrecTtl() {
        return precTtl;
    }

    public double getPrecUd() {
        return precUd;
    }
    public void setPrecUd(double precUd) {
        this.precUd = precUd;
    }
}
