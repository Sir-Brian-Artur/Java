package T03;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.println("Introduce un Número");
        num = keyboard.nextInt();
        while (num <= 0){
            System.out.println("Vuelve a introducir un número");
            num = keyboard.nextInt();
        }
        System.out.println("Congratulations!!");

        keyboard.close();
    }
}
