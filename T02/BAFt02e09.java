/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int h;

        System.out.print("Hora: ");
        h = teclado.nextInt();

        if (h < 9 || h > 14) {
            System.out.println("No hay buses a esa hora");
        } else {
            if (h == 9 || h == 11 || h == 13) {
                System.out.println("Hay buses los domingos");
            } else if (h == 10) {
                System.out.println("Hay buses todos los días");
            } else if (h == 12) {
                System.out.println("Hay buses los jueves y domingos");
            } else if (h == 14) {
                System.out.println("Hay buses todos los días menos los sábados");
            }
        }

        teclado.close();
    }
}
