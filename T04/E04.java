package T04;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean letter = false;
        String cadena;

        do {
            System.out.print("Escribe contraseña: ");
            cadena = keyboard.nextLine();
            for (int cont = 0; cont < cadena.length(); cont++) {
                switch (cadena.charAt(cont)) {
                    case 'a','b','c','d','e','f','g','h','i','j' -> letter = false;
                    default -> letter = true;
                }
            }
        }
        while (cadena.length() < 5 || cadena.length() > 10 || letter == true);

        System.out.println(cadena);
        keyboard.close();
    }
}
