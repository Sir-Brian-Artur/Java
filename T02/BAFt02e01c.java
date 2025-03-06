/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01c {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " es par ");
        } else {
            System.out.println(a + " es impar");
        }

        teclado.close();
    }
}
