/*
Consumo vehículo
Autor: Brian Artur Faro
Fecha: 2024-07-05
 */
package T01;

import java.util.Scanner;

public class Dam081t01e07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int initKm, finalKm;
        float initL, finalL, consum;

        System.out.println(
            "Introduce el kilometraje de la útima vez que repostaste"
        );
        initKm = teclado.nextInt();
        System.out.println(
            "Introduce los litros que tenía el vehículo en ese momento"
        );
        initL = teclado.nextFloat();
        System.out.println(
            "Introduce el kilometraje actual del vehículo"
        );
        finalKm = teclado.nextInt();
        System.out.println(
            "Introduce los litros que tiene el vehículo ahora"
        );
        finalL = teclado.nextFloat();

        //2. Algoritmo
        consum = 100f * (initL - finalL) / (finalKm - initKm);

        //3. Salida de datos
        System.out.println("El consumo medio es de: "+consum+"l/100km");

        teclado.close();
    }
}
