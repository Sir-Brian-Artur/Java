/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01b {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual que " + b);
        }

        teclado.close();
    }
}
