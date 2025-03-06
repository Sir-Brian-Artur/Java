/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int d1, m1, y1, d2, m2, y2;

        System.out.print("Día de la primera fecha: ");
        d1 = teclado.nextInt();
        System.out.print("Mes de la primera fecha: ");
        m1 = teclado.nextInt();
        System.out.print("Año de la primera fecha: ");
        y1 = teclado.nextInt();
        System.out.print("Día de la segunda fecha: ");
        d2 = teclado.nextInt();
        System.out.print("Mes de la segunda fecha: ");
        m2 = teclado.nextInt();
        System.out.print("Año de la segunda fecha: ");
        y2 = teclado.nextInt();

        if (y2 > y1 || y2 == y1 && m2 > m1 || y2 == y1 && m2 == m1 && d2 > d1) {
            System.out.println("La segunda fecha es mayor que la primera");
        } else if (y2 < y1 || y2 == y1 && m2 < m1 || y2 == y1 && m2 == m1 && d2 < d1) {
            System.out.println("La primera fecha es mayor que la segunda");
        } else {
            System.out.println("Ambas fechas son iguales");
        }

        teclado.close();
    }
}
