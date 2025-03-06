/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01i {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();

        if (a % b == 0 && b > 0) {
            System.out.println(b + " es divisor de " + a);
        } else {
            System.out.println(b + " no es divisor de " + a);
        }

        teclado.close();
    }
}
