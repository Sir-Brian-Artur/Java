package T03;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num, acum, i = 0;
        acum = 0;

        do {
            System.out.print("Número: ");
            num = keyboard.nextInt();
            acum += num;
            i++;
        }
        while (num <= 1000 && i < 15);

        System.out.println("Suma total: " + acum);
        
        keyboard.close();
    }
}
