/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Introduce un número: ");
        n = teclado.nextInt();

        if (n > 10) {
            System.out.println(n + " es mayor que 10");
        } else {
            System.out.println(n + " es menor que 10");
        }

        teclado.close();
    }
}
