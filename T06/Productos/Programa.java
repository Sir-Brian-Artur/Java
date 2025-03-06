package T06.Productos;

public class Programa {
    public static void main(String[] args) {
        Producto p1 = new Producto("ordenador", 0, 21);
        Producto p2 = new Producto("barra de pan", 0, 4);
        p1.setDescuento(0.1);
        System.out.println(p1.precio);
        p2.nombre = "Jamon serrano";
        System.out.println(p2.nombre);
    }
}
