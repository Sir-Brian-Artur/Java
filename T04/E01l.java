package T04;


import java.util.Scanner;

public class E01l {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena;
        int acum = 0;
        System.out.println("Escribe texto");
        cadena = keyboard.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char num = cadena.charAt(i);
          
            if (Character.isDigit(num)) acum++;
        }
        System.out.println("Hay " + acum + " dígitos");
        keyboard.close();
    }
}
