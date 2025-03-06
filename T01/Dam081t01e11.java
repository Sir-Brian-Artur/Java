/*
Hypotenusa
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
            
        
        double x, y, hypot;
        System.out.print("Introduce x: ");
        x = teclado.nextDouble();
        System.out.print("Introduce y: ");
        y = teclado.nextDouble();

        hypot = Math.hypot(x, y);

        System.out.println("La popotenusa es " + hypot);
    
        teclado.close();
    }
}
