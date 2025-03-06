/*
Hipopotenusa
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
         
        int x, y, area;
        System.out.print("Introduce x: "); 
        x = teclado.nextInt(); 
        System.out.print("Introduce y: "); 
        y = teclado.nextInt(); 
        
        x = (int)Math.sqrt(x*x);
        y = (int)Math.sqrt(y*y);
        area = x * y;
        
        System.out.println(
            "El area del cuadrado resultante es " + area + "m^2"
        );

        teclado.close();
    }
}
