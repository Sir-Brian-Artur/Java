package T04;       // INACABADO

import java.util.Scanner;

public class E14d {
    public static void main(String[] args) {

        Scanner teclado = new java.util.Scanner(System.in);
        
        String text;
        System.out.println("Introduce un texto: ");
        text = teclado.nextLine();

        StringBuilder cadena = new StringBuilder(text);

        cadena.delete(5, 10);

        System.out.println(cadena);

        teclado.close();
    }
}
