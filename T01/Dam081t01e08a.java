/*
Consumo vehículo
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e08a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int person1, person2, person3, person4;
        float media;

        System.out.println(
            "Introduce la edad de la primera persona"
        );
        person1 = teclado.nextInt();
        System.out.println(
            "Introduce la edad de la segunda persona"
        );
        person2 = teclado.nextInt();
        System.out.println(
            "Introduce la edad de la tercera persona"
        );
        person3 = teclado.nextInt();
        System.out.println(
            "Introduce la edad de la cuarta persona"
        );
        person4 = teclado.nextInt();
        

        //2. Algoritmo
        media =  ((float)person1 + person2 + person3 + person4) / 4f;

        //3. Salida de datos
        System.out.println("La media de edad es de: " + media + " años");

        teclado.close();
    }
}
