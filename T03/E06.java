package T03;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i;
        i = 100;

        while (i > 0) {
            System.out.println("i: " + i);
            i -= 2;
        }

        teclado.close();
    }
}
