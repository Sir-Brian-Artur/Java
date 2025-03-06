package T04;


import java.util.Scanner;

public class E01h {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Escribe un número");
        int num = Integer.parseInt(keyboard.nextLine());

        System.out.println(num);
        keyboard.close();
    }
}
