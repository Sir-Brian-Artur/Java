package T03;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {

        int num, ac;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número: ");
        num = teclado.nextInt();
        ac = 0;

        for (int i = num; i < num + 100; i++) { 
            ac += i;
        }
        System.out.println(ac);
        teclado.close();
    }
}
