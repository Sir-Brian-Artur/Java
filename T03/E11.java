package T03;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int m, n, i, loop;
        System.out.print("m: ");
        m = teclado.nextInt();
        System.out.print("n: ");
        n = teclado.nextInt();
        teclado.close();

        loop = Math.abs(n - m);

        for (i = 1; i < loop; i++) {
            if (n > m) {
                m++;
                System.out.print(m + " ");
                System.out.println((int)Math.pow(m, 2));
            } else {
                n++;
                System.out.print(n + " ");
                System.out.println((int)Math.pow(n, 2));
            }

        }

    }
}
