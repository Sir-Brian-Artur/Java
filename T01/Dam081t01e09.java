/*
Intercambio de valores
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int var1, var2, var3; 
        System.out.print("Introduce var1: "); 
        var1 = teclado.nextInt(); 
        System.out.print("Introduce var2: "); 
        var2 = teclado.nextInt(); 
        var3 = var2; 
        var2 = var1;
        var1 = var3;
        System.out.println("Ahora var1 es igual a " + var1);     
        System.out.println("Ahora var2 es igual a " + var2); 
     
        teclado.close();
    }
}
