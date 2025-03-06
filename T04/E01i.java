package T04;


import java.util.Scanner;

public class E01i {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Escribe un número hexadecimal");
        int num = Integer.parseInt(keyboard.nextLine(), 16);

        System.out.println(num);
        keyboard.close();
    }
}
