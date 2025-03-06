package T03;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num < 0 && num > 1000) 
            System.out.println("Numero incorrecto.");
        else
            for (int i = num; i >= 1; i--)    // Condición del for incorrecta
                System.out.println(i);      // Sobra el if. No hace nada

        teclado.close();

        // Tenemos un programa que imprime descendentemente numeros desde el
        // el valor asignado, hasta 1.
        // No es posible reducir más el "for".
    }
}
