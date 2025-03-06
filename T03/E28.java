package T03;

import java.util.Scanner;

public class E28 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a, b, suma = 0, media = 0, prod = 1, pares = 0;
        System.out.print("Número a: ");
        a = keyboard.nextInt();
        System.out.print("Número b: ");
        b = keyboard.nextInt();

        if (b > a){
            while (a + 1 < b){
                if (a % 2 == 0) {
                    suma += a;
                    pares++;
                    prod *= a;
                }
                a++;
            }  
        } else {
            while (b + 1 < a){
                if (b % 2 == 0) {
                    suma += b;
                    pares++;
                    prod *= b;
                }
                b++;
            }
        }
        media = suma / pares;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Producto: " + prod);

        keyboard.close();
    }
}
