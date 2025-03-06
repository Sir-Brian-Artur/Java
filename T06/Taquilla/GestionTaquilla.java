package T06.Taquilla;

import java.util.Scanner;

public class GestionTaquilla {
    public static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in); 
        System.out.println("Cuantas entradas hay a la venta? ");
        int totalEntradas = teclado.nextInt();

        Taquilla taquilla = new Taquilla(totalEntradas, 10);
        do {
            System.out.println("Entradas a comprar: ");
            int entradas = teclado.nextInt();
            boolean result = taquilla.comprarEntradas(entradas);
            if (result) System.out.println("Compra exitosa" );
            else System.out.println("Compar invalida");
        } while (taquilla.hayEntradas());
        int max = taquilla.maxEntradaLlevada;
        System.out.println("Maxima entrada llevada: " + max);
    }
}
