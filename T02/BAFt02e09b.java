/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e09b {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int h;

        System.out.print("Hora: ");
        h = teclado.nextInt();

        switch (h) {
            case 9, 11, 13:
                System.out.println("Hay buses los domingos");
                break;
            case 10:
                System.out.println("Hay buses todos los días");
                break;
            case 12:
                System.out.println("Hay buses los jueves y domingos");
                break;
            case 14:
                System.out.println("Hay buses todos los días menos los sábados");
                break;
            default:
                System.out.println("No hay buses a esa hora");
        }

        teclado.close();
    }
}
