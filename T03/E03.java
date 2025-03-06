package T03;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n ;
        System.out.print("Número ");
        n = teclado.nextInt();
        
        while (n >= 0) {
            if (n % 2 == 0)
            System.out.println("Es par");
            else 
            System.out.println("Es impar");
        
            System.out.print("Número ");
            n = teclado.nextInt();
        }
        System.out.print("FIN");
        teclado.close();
    }
}
