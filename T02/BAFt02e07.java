/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int year;

        System.out.print("Año: ");
        year = teclado.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Bisiesto. Viva Santiago Apostol!");
        } else {
            System.out.println("No bisiesto. Paga el trimestral.");
        }

        teclado.close();
    }
}
