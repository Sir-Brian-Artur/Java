package T03;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, a;
        n = 0;
        a = 0;

        while (n >= 0) {
            a += n;

            System.out.println("Teclee unnúmero negativo para finalizar");
            System.out.print("Número: ");
            n = teclado.nextInt();
        }
        System.out.print("Valor de a: " + a);
        teclado.close();
    }
}
