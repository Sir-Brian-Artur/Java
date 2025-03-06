package T05;

import java.util.Scanner;

public class E01 {
    
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("ingrese num1: ");
        num1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("ingrese num2: ");
        num2 = Integer.parseInt(keyboard.nextLine());
        num3 = aleatorio(num1, num2);
        System.out.println(num3);
        keyboard.close();
    }

    static boolean par (int num) { 
        return num % 2 == 0;
    }

    static double mayor (double a, double b, double c) {
        if (a > b) {
            if (a > c) return a;
            return c;
        } else if (b > c) return b;
            return c;
    }
    
    static long sumaIntervalo (long num1, long num2) {
        long suma = 0;
        if (num1 < num2 && num1 > 0 && num2 > 0) {
            for (long i = num1; i < num2; i++){
                suma += i;
            }
            return suma;
        } else return -1;
    }

    static int contarCeros (String cadena) {
        int counter = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.indexOf(i) != -1) counter++;
        }
        return counter;
    }

    static int aleatorio (int a, int b) {
        int numero = -1;
        if (a < b && a > 0 && b > 0) {
            numero = (int)Math.floor(Math.random() * (b - a) + a);
        }
        return numero;
    }

}