package T07b.E19;

import java.util.ArrayList;

public class CarritoCompra {
    private ArrayList <Producto> carrito;

    CarritoCompra(){
        carrito = new ArrayList<>();
    }

    public void estadoCarro(){
        double totalCarro = 0;
        for (Producto p : carrito) {
            System.out.println(p.getCodProd() + "   " + p.getDesProd() + "....." + p.getPrecUd());
            System.out.println("     " + p.getCant() + "          " + p.getPrecTtl());
            totalCarro += p.getPrecTtl();
        }
        System.out.println("TOTAL:          " + totalCarro);
    }

    public void mtCart(){
        carrito.clear();
    }

    public void addProd(int codProd, String desProd, double precUd, int cant){
        carrito.add(new Producto(codProd, desProd, precUd, cant));
    }

    public boolean dltProd(int codProd){
        for (Producto producto : carrito) {
            if (producto.getCodProd() == codProd) {
                carrito.remove(producto);
                return true;
            }
        }        
        return false;
    }
}
