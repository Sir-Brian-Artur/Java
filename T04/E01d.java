package T04;


import java.util.Scanner;

public class E01d {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String Cadena;
        System.out.println("Escribe texto");
        Cadena = keyboard.nextLine();

        int letter = Cadena.indexOf('x', 3);

        if (letter != -1) System.out.println("Tiene una 'x' en la posición 3");
       
        keyboard.close();
    }
}
