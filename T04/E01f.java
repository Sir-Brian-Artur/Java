package T04;


import java.util.Scanner;

public class E01f {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String Cadena, subCadena;
        System.out.println("Escribe texto");
        Cadena = keyboard.nextLine();

        subCadena = Cadena.substring(Cadena.length() - 5);

        System.out.println(subCadena);
       
        keyboard.close();
    }
}
