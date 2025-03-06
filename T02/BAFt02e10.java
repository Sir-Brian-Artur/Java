/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int d, m, y;

        System.out.print("Día: ");
        d = teclado.nextInt();
        System.out.print("Mes: ");
        m = teclado.nextInt();
        System.out.print("Año: ");
        y = teclado.nextInt();

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (d > 0 && d < 32) {
                    System.out.println("El día es correcto");
                }
                break;
            case 4, 6, 9, 11:
                if (d > 0 && d < 31) {
                    System.out.println("El día es correcto");
                }
                break;
            case 2:
                if ((y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && (d > 0 && d < 30)) {
                    System.out.println("El día es correcto");
                } else if (d > 0 && d < 29) {
                    System.out.println("El día es correcto");
                }
            break;
        default :
            System.out.println("Algún valor no es correcto");
        }

        teclado.close();
    }
}
