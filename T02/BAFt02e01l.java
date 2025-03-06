/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01l {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();
        System.out.print("Introduce otro número más: ");
        c = teclado.nextInt();

        if (a > 0 || b > 0 || c > 0) {
            System.out.println("Alguno de los números es mayor que 0");
        } else {
            System.out.println("Ningún número es mayor que 0");
        }

        teclado.close();
    }
}
