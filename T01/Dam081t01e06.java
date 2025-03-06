/*
Conversor climatología
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        final float GAIN, TAX;
        float cost, price;

        GAIN = 1.1f;
        TAX = 1.2f;
        
        System.out.println("Introduce el coste del vehículo");
        cost = teclado.nextFloat();

        //2. Algoritmo
        price = ( cost * GAIN ) * TAX;

        //3. Salida de datos
        System.out.println("El precio al consumidor es de: "+price+"€");

        teclado.close();
    }
}
