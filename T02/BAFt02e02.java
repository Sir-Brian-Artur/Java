/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c, result;

        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();
        System.out.print("Introduce otro número más: ");
        c = teclado.nextInt();

        if ((((a < 0 ^ b < 0 ^ c < 0) ^ (a < 0 && b < 0 && c < 0)) || !(a < 0 ^ b < 0 ^ c < 0)) && (!(a < 0 && b < 0 && c < 0)) && (!(a >= 0 && b >= 0 && c >= 0))) {
            result = a + b + c;
            System.out.println("La suma es: " + result);
        } else if (a < 0 && b < 0 && c < 0) {
            result = a * b * c;
            System.out.println("El producto es: " + result);
        } else if (a >= 0 && b >= 0 && c >= 0) {
            result = (a + b) * c;
            System.out.println("El resultado es: " + result);
        }

        teclado.close();
    }
}
