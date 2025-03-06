/*
Conversor euro-dolar
Autor: Brian Artur Faro
Fecha: 2024-07-04
 */
package T01;

import java.util.Scanner;

public class Dam081t01e02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        float amount, eurUsd, result;
        eurUsd = 1.0814f;
        System.out.println("Introduce la cantidad");
        amount = teclado.nextFloat();

        //2. Algoritmo
        result = amount / eurUsd;
        result = Math.round(result * 100) / 100f;

        //3. Salida de datos
        System.out.println("El resultado es: " + result + "€");
    
        teclado.close();
    }
}
