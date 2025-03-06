package T04;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;

        System.out.println("Escribe número del DNI");
        dni = Integer.parseInt(keyboard.nextLine());

        char letter = letra.charAt(dni % 23);
        System.out.println(letter);

        keyboard.close();
    }
}
