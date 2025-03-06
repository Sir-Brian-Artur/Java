package T03;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {

        int num, ac;
        Scanner teclado = new Scanner(System.in);
        ac = 0;

        while (ac <= 100) {
            System.out.print("Número: ");
            num = teclado.nextInt();
            ac += num;
            System.out.println("Valor actual: " + ac);
        }
        System.out.println("Volar total: " + ac);
        teclado.close();
    }
}
