/*
Conversor euro-dolar
Autor: Brian Artur Faro
Fecha: 2024-07-04
 */
package T01;

import java.util.Scanner;

public class Dam081t01e03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //1. Entrada de datos
        int num1, num2, sum, res;
        float div;

        System.out.println("Introduce un número");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        num2 = teclado.nextInt();

        //2. Algoritmo
        sum = num1 + num2;
        res = num1 - num2;
        div = (float)num1 / num2;
        
        //3. Salida de datos
        System.out.println("La suma da: " + sum);
        System.out.println("La resta da: " + res);
        System.out.println("La división da: " + div);
        
        teclado.close();   
    }
}
