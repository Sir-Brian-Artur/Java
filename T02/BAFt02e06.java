/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float x, y, a, b, c, d, e, f;

        System.out.print("a: ");
        a = teclado.nextFloat();
        System.out.print("b: ");
        b = teclado.nextFloat();
        System.out.print("c: ");
        c = teclado.nextFloat();
        System.out.print("d: ");
        e = teclado.nextFloat();
        System.out.print("e: ");
        d = teclado.nextFloat();
        System.out.print("f: ");
        f = teclado.nextFloat();

        if (((a * e) - (b * d)) <= 0) {
            System.out.println("Operación no admitida, revisa los valores");
        } else {
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));
            y = ((a * f) - (c * d)) / ((a * e) - (b * d));
            System.out.println("X vale " + x);
            System.out.println("Y vale " + y);
        }

        teclado.close();
    }
}
