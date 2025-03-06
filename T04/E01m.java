package T04;


import java.util.Scanner;

public class E01m {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cadena, cadenaInversa = "";
        System.out.println("Escribe texto");
        cadena = keyboard.nextLine();

        for (int i = cadena.length() - 1; i >= 0 ; i--){
            cadenaInversa = cadenaInversa + cadena.charAt(i); 
        }

        if (cadenaInversa.equals(cadena))  
            System.out.println("Es igual");
        keyboard.close();
    }
}
