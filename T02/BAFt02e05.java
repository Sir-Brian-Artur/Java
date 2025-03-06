/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int sec, min, h;

        System.out.print("Hora: ");
        h = teclado.nextInt();
        System.out.print("Minuto: ");
        min = teclado.nextInt();
        System.out.print("Segundo: ");
        sec = teclado.nextInt();

        if (h > 23 || min > 59 || sec > 59) {
            System.out.println("revisa los valores");
        } else {
            sec = h * 3600 + min * 60 + sec;
            System.out.println("Han pasado: " + sec + "s");
        }

        teclado.close();
    }
}
