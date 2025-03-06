package T04;

import java.util.Scanner;

public class E01n {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena = new String();
        String cadena2 = new String();

        char fst, lst;
        System.out.println("Escribe texto");
        cadena = keyboard.nextLine();
        fst = cadena.charAt(0);
        
        cadena2 = cadena.replace(cadena.charAt(cadena.length() - 1), fst);

        lst = cadena.charAt(cadena.length() - 1);

        cadena2 = cadena2.replace(cadena2.charAt(0), lst);

        System.out.println(cadena2);
        System.out.println(lst + " " + fst);
        keyboard.close();
    }
}
