/*
Consumo vehículo
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e08c {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int person;
        float media;

        media = 0f;

        //2. Algoritmo
        System.out.println("Introduce la primera edad");
        person = teclado.nextInt();
        media = media + person;
        System.out.println("Introduce la segunda edad");
        person = teclado.nextInt();
        media = media + person;
        System.out.println("Introduce la tercera edad");
        person = teclado.nextInt();
        media = media + person;
        System.out.println("Introduce la cuarta edad");
        person = teclado.nextInt();
        media = media + person;

        media = media / 4;

        //3. Salida de datos
        System.out.println("La media de edad es de: " + media + " años");

        teclado.close();
    }
}
