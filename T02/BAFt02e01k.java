/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01k {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();

        if (a % 2 == 0) {
            if (a % 10 == 0 && a % 3 == 0) {
                System.out.println(a + " es múltiplo de 2, de 3 y de 10");
            } else if (a % 10 == 0) {
                System.out.println(a + " es múltiplo de 2 y de 10");
            } else {
                System.out.println(a + " es múltiplo sólo de 2");
            }
        } else if (a % 3 == 0) {
            System.out.println(a + " es múltiplo sólo de 3");
        }

        teclado.close();
    }
}
