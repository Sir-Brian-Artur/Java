package T04;

import java.util.Scanner;

public class E01b {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String Cadena;
        System.out.println("Escribe texto");
        Cadena = keyboard.nextLine();

        int letter = Cadena.indexOf('x');

        if (letter != -1) System.out.println("Contiene una 'x'");
       
        keyboard.close();
    }
}
