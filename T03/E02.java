package T03;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Coloca un número ");
        n = teclado.nextInt();
        teclado.close();
        for (int i = n; i < n + 10; i++) {
            System.out.println(i);
        }
    }
}
