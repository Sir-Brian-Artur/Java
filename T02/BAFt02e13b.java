/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e13b {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n; 

        System.out.print("Nota: ");
        n = teclado.nextInt();

        switch (n) {
            case 0, 1, 2: System.out.println("Muy deficiente"); break;
            case 3, 4: System.out.println("Insuficiente"); break;
            case 5, 6: System.out.println("Aprobado"); break;
            case 7, 8: System.out.println("Notable"); break;
            case 9, 10: System.out.println("Sobresaliente"); break;
            default: System.out.println("Fuera de rango");
        }

        teclado.close();
    }
}
