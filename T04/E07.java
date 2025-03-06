package T04;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String cadena;
        cadena = keyboard.nextLine();
        cadena = cadena.replace('A', 'F');
        cadena = cadena.replace('B', 'X');
        cadena = cadena.replace('C', 'M');

        System.out.println(cadena);
        keyboard.close();
    }
}
