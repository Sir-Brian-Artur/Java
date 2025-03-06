package T05;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número real: ");
        num = Integer.parseInt(keyboard.nextLine());

        System.out.println(cantidadDivisores(num));

        keyboard.close();
    }

    static int cantidadDivisores(int num) {
        int acumulator = 0;
        if (num < 1) return 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                acumulator++;
        }
        return acumulator;
    }

}