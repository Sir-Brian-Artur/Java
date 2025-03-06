package T04;


import java.util.Scanner;

public class E01c {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String Cadena;
        System.out.println("Escribe texto");
        Cadena = keyboard.nextLine();

        if (Cadena.length() > 10) System.out.println("Tiene más de 10 caracteres");
       
        keyboard.close();
    }
}
