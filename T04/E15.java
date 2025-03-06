package T04;       // INACABADO

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {

        Scanner teclado = new java.util.Scanner(System.in);
        
        String text;
        System.out.println("Introduce un texto: ");
        text = teclado.nextLine();
        StringBuilder texto = new StringBuilder(text);
        for (int i = 1; i < text.length(); i+=2) {
            texto.setCharAt(i, '*');
        }
        System.out.println(texto);
        teclado.close();
    }
}
