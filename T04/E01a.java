package T04;

import java.util.Scanner;

public class E01a {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String Cadena;
        System.out.println("Escribe texto");
        Cadena = keyboard.nextLine();

        System.out.println(Cadena.toUpperCase());
        System.out.println(Cadena.toLowerCase());
       
        keyboard.close();
    }
}
