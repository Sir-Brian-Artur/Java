package T06.Productos;

public class Programa2 {
    public static void main(String[] args) {
        Producto p3 = new Producto("impresora", 50d, 0.21d);
        Producto p4 = p3;
        p3.precio = 60;
        System.out.println(p4.precio);
    }
}
