package T06.Productos;

public class Producto {
    public String nombre;
    public double precio;
    public double IVA;
    public double descuento;

    public Producto(String nom, double p, double IVA) {
        this.nombre = nom;
        this.precio = p;
        this.IVA = IVA;
        this.descuento = 0;
    }

    public double calcularPrecioFinal() {
        double prFin = this.precio + (this.precio * this.IVA);
        double prFinDesc = prFin - (prFin * this.descuento);
        return prFinDesc;
    }

    public void setDescuento(double desc) {
        this.descuento = desc;
    }
}

// a) Tiene 4 atributos
// b) Tiene 1 Constructor
// c) Tiene 2 métodos
// d) Crearía un archivo a parte para ejecutar el "main()"; y así respetar el principio de modularidad del código
// e) Los productos se inician sin ningún descuento inicial. De ahí que para aplicar algún descuento, haya que invocar a la función "setDescuento()".
// f) System.out.println(p1.precio); System.out.println(p2.precio);
// g) p1.setDescuento(0.1); System.out.println(p1.precio);
// h) p2.nombre = "Jamon serrano";
// i) Que el "IVA" del ordenador va a ser del 4%.
// j) Que el descuento de "p1" volverá a ser 0.
// k) Que la variable p1 va a apuntar ahora al objeto que ya apunta "p2". Por lo que va a correcponder al mismo objeto, ambas variables.
// l) Igualaría cada uno de sus atributos nada más instanciar el objeto "p2".
// m) Sólo sucede si los valores de "p1" son iguales a los valores de "p2". Pero no, en el caso de que hagamos la sentencia "k)".
// n) Mostrará "60.0" ya que amba variables apuntan al mismo objeto "p3". Alcambiar el precio de "p3", también estás cambiando el precio de "p4".