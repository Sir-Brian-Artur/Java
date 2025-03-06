package T03;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Número ");
        n = teclado.nextInt();
        if (n > 0 && n <= 10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
        System.out.print("FIN");
        teclado.close();
    }
}
