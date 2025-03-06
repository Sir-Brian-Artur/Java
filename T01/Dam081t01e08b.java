/*
Consumo vehículo
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e08b {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int person;
        float media;
        
        media = 0f;
        
        //2. Algoritmo
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la edad");
            person = teclado.nextInt();
            media = media + person;
        }
        media = media / 4;

        //3. Salida de datos
        System.out.println("La media de edad es de: " + media + " años");

        teclado.close();
    }
}
