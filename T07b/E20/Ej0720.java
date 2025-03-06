package T07b.E20;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej0720 {
    static Scanner sc;
    static Factura factura;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        carro = new CarritoCompra();
        char res; boolean exit = false;
        do { res = pintarMenu();
            switch (res) {
                case '1': factura(); break;
                case '2': vaciarCarro(); break;
                case '3': añadirProducto(); break;
                case '4': eliminarProducto(); break;
                case '5': exit = true; break;
                default: System.out.println("Opción inválida");
            }
            
        } while (!exit);
    }

    private static char pintarMenu(){
        char res;
        System.out.println("--------------------------\n");
        System.out.println("Elija una opción:");
        System.out.println(" 1 - Imprimir factura");
        System.out.println(" 2 - Vaciar carro");
        System.out.println(" 3 - Añadir producto");
        System.out.println(" 4 - Eliminar producto");
        System.out.println(" 5 - Salir");
        System.out.println("--------------------------\n");
        res = sc.next().charAt(0);
        sc.nextLine();  // Limpiar buffer de Scanner
        return res;
    }

    static void factura(){
        carro.estadoCarro();
    }

    static void vaciarCarro(){
        carro.mtCart();
    }

    private static void añadirProducto(){
        sc = new Scanner(System.in);
        int cod, cant;
        String des; double prec;
        System.out.println("--------------------------\n");
        System.out.print("Código del producto: ");
        cod = sc.nextInt();
        System.out.print("Descripción del producto: ");
        des = sc.next();
        System.out.print("Precio del producto: ");
        prec = sc.nextDouble();
        System.out.println("Cantidad del producto: ");
        cant = sc.nextInt();
        sc.nextLine();  // Limpiar buffer de Scanner
        carro.addProd(cod, des, prec, cant);
    }

    static void eliminarProducto(){
        sc = new Scanner(System.in);
        int cod;
        carro.estadoCarro();
        System.out.print("Codigo del producto a borrar: ");
        cod = sc.nextInt();
        carro.dltProd(cod);
    }
}