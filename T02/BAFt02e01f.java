/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01f {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();

        if (a >= 10 && a <= 20) {
            System.out.println(a + " está entre 10 y 20");
        } else {
            System.out.println(a + " está fuera de entre 10 y 20");
        }

        teclado.close();
    }
}
