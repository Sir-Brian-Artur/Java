package T03;

import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int times;
        String menssage;
        System.out.print("Número: ");
        times = keyboard.nextInt();

        for (int i = 0; i < times; i++){
            menssage = (i % 2 == 0) ? "Hola" : "Adiós";
            System.out.println(menssage);
        }
        keyboard.close();
    }
}
