/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e01d {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();

        if (a > 10 && b > 10) {
            System.out.println(a + " y " + b + " son mayores que 10");
        } else {
            System.out.println("Ambos números son menores que 10");
        }

        teclado.close();
    }
}
