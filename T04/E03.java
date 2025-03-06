package T04;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena;
        char caracter;
        int cont = 0;

        System.out.println("Escribe un texto");
        cadena = keyboard.nextLine();
        System.out.println("Escribe un caracter");
        caracter = keyboard.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == caracter) cont++;
        }

        System.out.println("El caracter se repite " + cont + " veces");
        keyboard.close();
    }
}
