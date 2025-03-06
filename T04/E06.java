package T04;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String cadena, subString;
        cadena = keyboard.nextLine();
        subString = cadena.substring(cadena.indexOf('@') + 1, cadena.indexOf(".com"));

        System.out.println(subString);
        keyboard.close();
    }
}
