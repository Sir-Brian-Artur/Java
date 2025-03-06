/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x1, y1, x2, y2, base, altura, area;

        System.out.print("Valor de x1: ");
        x1 = teclado.nextInt();
        System.out.print("Valor de y1: ");
        y1 = teclado.nextInt();
        System.out.print("Valor de x2: ");
        x2 = teclado.nextInt();
        System.out.print("Valor de y2: ");
        y2 = teclado.nextInt();

        base = 0;
        altura = 0;

        if (x2 > x1) {
            base = Math.abs(x2 - x1);
            System.out.println("Base: " + base);
        } else if (x1 > x2) {
            base = Math.abs(x1 - x2);
            System.out.println("Base: " + base);
        }
        if (y2 > y1) {
            altura = Math.abs(y2 - y1);
            System.out.println("Altura: " + altura);
        } else if (y1 > y2) {
            altura = Math.abs(y1 - y2);
            System.out.println("Altura: " + altura);
        }
        area = base * altura;
        if (base == altura) {
            System.out.println("El area del cuadrado es: " + area);
        } else {
            System.out.println("El area del rectágulo es: " + area);
        }

        teclado.close();
    }
}
