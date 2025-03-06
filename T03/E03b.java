package T03;

import java.util.Scanner;

public class E03b {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n ;
        n = 0;
        
        while (n >= 0) {
            System.out.print("Número ");
            n = teclado.nextInt();

            if (n % 2 == 0)
            System.out.println("Es par");
            else 
            System.out.println("Es impar");
        }
        System.out.print("FIN");
        teclado.close();
    }
}
