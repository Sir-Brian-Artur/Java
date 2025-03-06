package T03;

import java.util.Scanner;

public class E31 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n0 = 0, n1 = 0, n2 = 0, n27 = 0, n28 = 0, n29 = 0, num, suma = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Número: ");
            num = keyboard.nextInt();
            suma += num;

            switch (i) {
                case 0 : n0 = num;
                case 1 : n1 = num;
                case 2 : n2 = num;
                case 27 : n27 = num;
                case 28 : n28 = num;
                case 29 : n29 = num;
            }

        }
        if (suma % 2 == 0)
            System.out.println("Suma par: " + n0 + " " + n1 + " " + n2);
        else
            System.out.println("Suma impar: " + n27 + " " + n28 + " " + n29);

        keyboard.close();
    }
}
