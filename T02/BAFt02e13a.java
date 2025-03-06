/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e13a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n; 

        System.out.print("Nota: ");
        n = teclado.nextInt();

        if (n >= 0 && n < 3) System.out.println("Muy deficiente");
        else if (n < 5) System.out.println("Insuficiente");
        else if (n < 7) System.out.println("Aprobado");
        else if (n < 9) System.out.println("Notable");
        else if (n < 11) System.out.println("Sobresaliente");
    
        teclado.close();
    }
}
