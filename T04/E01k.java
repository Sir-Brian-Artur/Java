package T04;


import java.util.Scanner;

public class E01k {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena;
        char fst, lst;
        System.out.println("Escribe texto");
        cadena = keyboard.nextLine();
        fst = cadena.charAt(0);
        lst = cadena.charAt(cadena.length() - 1);

        if(fst == lst) System.out.println("mismo valor");
        keyboard.close();
    }
}
