package T04;

import java.util.Scanner;

public class E08b {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        String cadena;
        char letter;
        System.out.println("Introduce un texto");
        cadena = keyboard.nextLine();

        System.out.println("Introduce un número");
        num = Integer.parseInt(keyboard.nextLine());

        System.out.println("Introcude un caracter");
        letter = keyboard.nextLine().charAt(0);
        String caracter = Character.toString(letter);

        StringBuilder cadenita = new StringBuilder(cadena);
        cadenita = cadenita.replace(num, num, caracter);

        System.out.println(cadenita);
        keyboard.close();
    }
}
