package T04;


import java.util.Scanner;

public class E01j {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena, nuevaCadena;
        System.out.println("Escribe texto");
        cadena = keyboard.nextLine();
        nuevaCadena = cadena.replace("prueva", "prueba");

        System.out.println(nuevaCadena);
        keyboard.close();
    }
}
