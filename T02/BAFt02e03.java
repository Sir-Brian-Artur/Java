/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ex, tc, tp;

        System.out.print("Nota del examen: ");
        ex = teclado.nextInt();
        System.out.print("Nota de trabajo en clase: ");
        tc = teclado.nextInt();
        System.out.print("Nota del trabajo práctico: ");
        tp = teclado.nextInt();

        if ((ex >= 5) || (ex >= 4 && tc > 5 && tp > 5) || (ex >= 4 && (tc > 8 || tp > 8))) {
            System.out.println("Alumno aprobado");
        } else {
            System.out.println("Alumno suspenso");
        }

        teclado.close();
    }
}
