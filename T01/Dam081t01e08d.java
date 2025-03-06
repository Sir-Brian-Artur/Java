/*
Clacular media
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e08d {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        float media;

        media = 0f;

        //2. Algoritmo
        System.out.println("Introduce la primera edad");
        media += teclado.nextInt();
        System.out.println("Introduce la segunda edad");
        media += teclado.nextInt();
        System.out.println("Introduce la tercera edad");
        media += teclado.nextInt();
        System.out.println("Introduce la cuarta edad");
        media += teclado.nextInt();

        media = media / 4;

        //3. Salida de datos
        System.out.println("La media de edad es de: " + media + " años");

        teclado.close();
/*
Esta sería la forma más optima de crear un programa para calular la media de
edad de 4 personas. Ya que estamos reutilizando la misma variable para calcular
la suma total de todas las edades, y porteriormente, dividiéndola entre el
número de personas.

La parte mala de este algoritmo, es que necesitas que siempre haya 4 personas
para calcular la media. No sirve, en el caso de que quieras operar con una
cantidad distinta.        
*/
    }
}
