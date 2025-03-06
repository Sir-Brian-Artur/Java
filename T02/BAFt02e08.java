/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int d, h;

        System.out.print("Día: ");
        d = teclado.nextInt();
        System.out.print("Hora: ");
        h = teclado.nextInt();

        if (d < 1 || d > 7 || h < 9 || h > 14) {
            System.out.println(
                    "Alguno del los valores no set`'a dentro de la tabla"
            );
        } else {
            if (d == 7 || h == 10 || h == 14 && d != 6 || h == 12 && d == 4) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }
        }

        teclado.close();
    }
}
