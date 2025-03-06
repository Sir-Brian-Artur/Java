/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, r;

        System.out.print("Número 1: ");
        a = teclado.nextInt();
        System.out.print("Número 2: ");
        b = teclado.nextInt();

        /*
        if (b != 0 && a / b == 0) {
            r = a / b;
            System.out.println(r);
        }
        */
        
        // Versión a) Primero discrimina si en el segundo número hay un 0 o no.
        //            Luego comprueba la segunda condición, que la división sea
        //            igual a 0.
        
        /*
        if (a / b == 0 && b != 0) {
            r = a / b;
            System.out.println(r);
        }
        */
        
        // Versión b) Aquí lo que se hace primero es la división, y más tarde se
        //            comprueba que en dicha división no exista un 0 en el valor
        //            de "b". Esto provoca un error, ya que al comprobar esa
        //            primera condición, ya está dando el error que tratabamos
        //            de evitar.
        
        
        if (b != 0 & a / b == 0) {
            r = a / b;
            System.out.println(r);
        }
        
        // Versión c) En esta versión no se discrimina que la primera condición
        //            no se cumpla, aún así se sigue comprovando si la segunda
        //            cumple o no; y es ahí cuando se produce en error. Ya que 
        //            no se puede dividir entre 0.
        
        teclado.close();
    }
}
