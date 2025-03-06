package T04;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        String cadena;
        char letter, target;
        System.out.println("Introduce un texto");
        cadena = keyboard.nextLine();
        System.out.println("Introduce un número");
        num = Integer.parseInt(keyboard.nextLine());
        System.out.println("Introcude un caracter");
        letter = keyboard.nextLine().charAt(0);

        target = cadena.charAt(num);

        cadena = cadena.replace(target, letter);

        System.out.println(cadena);
        keyboard.close();
    }
}
