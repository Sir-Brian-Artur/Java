/*
Porcentaje de aprobados
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int susp, sufi, nota, sobr;
        float porcentajeAprobado, porcentajeNotaSobr;

        System.out.println("Introduce la cantidad de suspensos");
        susp = teclado.nextInt();
        System.out.println(
            "Introduce la cantidad de alumnos aprobados con un suficiente"
        );
        sufi = teclado.nextInt();
          System.out.println(
            "Introduce la cantidad de alumnos aprobados con un notable"
        );
        nota = teclado.nextInt();
          System.out.println(
            "Introduce la cantidad de alumnos aprobados con un sobresaliente"
        );
        sobr = teclado.nextInt();

        //2. Algoritmo
        porcentajeAprobado = 
           100f * (sufi + nota + sobr) / (susp + sufi + nota + sobr);
        porcentajeNotaSobr = 100f * (nota + sobr) / (susp + sufi + nota + sobr);
        
        //3. Salida de datos
        System.out.println(
            "Porcentaje de lumnos aprobados: " + porcentajeAprobado
        );
        System.out.println(
            "Porcentaje de alumnos con notable o sobresaliente: " 
            + porcentajeNotaSobr
        );

        teclado.close();
/*
¿Tendría algún sentido pedirle al usuario que introdujese el total de alumnos? 

Es un tanto irrelevante si el usuario nos aporta el total de alumnos de la
asignatura, ya que lo podemos averiguar sumando la cantidad de notas que hay.
*/
        
        
    }
}
