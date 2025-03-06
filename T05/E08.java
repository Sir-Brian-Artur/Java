package T05;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca un número: ");
        num1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Introduzca otro número: ");
        num2 = Integer.parseInt(keyboard.nextLine());
        
        int divider1 = divisor(num1);
        int divider2 = divisor(num2);
        int result = mayor(divider1, divider2);

        switch (result) {
            case 1 -> System.out.println(num1 + " tiene más divisores"); 
            case 2 -> System.out.println(num2 + " tiene más divisores"); 
            default -> System.out.println("Ambos tienen el mismo número de divisores");
        }

        keyboard.close();
    }

    static int divisor (int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count;
    }

    static int mayor (int a, int b) {
        if (a > b) return 1;
        else if (b > a) return 2;
        return 0;
    }
}