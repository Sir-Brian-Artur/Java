/*
Conversor climatología
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        float temp, water;

        System.out.println("Introduce la temperatura en Celsius");
        temp = teclado.nextFloat();
        System.out.println("Introduce la cantidad de agua en pulgadas");
        water = teclado.nextFloat();

        //2. Algoritmo
        temp = Math.round((temp * 9 / 5 + 32) * 100) / 100f;
        water = Math.round((water * 2.54) * 10) / 10f;

        //3. Salida de datos
        System.out.println("Temperatura: " + temp + "F");
        System.out.println("Volumen de agua: " + water + "cm");

        teclado.close();
    }
}
