/*
Autor: Brian Artur Faro
Curso: 1° DAM
Fecha: 2024-07-05
 */
package T02;

import java.util.Scanner;

public class BAFt02e14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n; 
        char letter;

        System.out.print("DNI: ");
        n = teclado.nextInt();
        letter = ' ';

        switch (n % 23) {
            case 0 -> letter = 'T';
            case 1 -> letter = 'R';
            case 2 -> letter = 'W';
            case 3 -> letter = 'A';
            case 4 -> letter = 'G';
            case 5 -> letter = 'M';
            case 6 -> letter = 'Y';
            case 7 -> letter = 'F';
            case 8 -> letter = 'P';
            case 9 -> letter = 'D';
            case 10 -> letter = 'X';
            case 11 -> letter = 'B';
            case 12 -> letter = 'N';
            case 13 -> letter = 'J';
            case 14 -> letter = 'Z';
            case 15 -> letter = 'S';
            case 16 -> letter = 'Q';
            case 17 -> letter = 'V';
            case 18 -> letter = 'H';
            case 19 -> letter = 'L';
            case 20 -> letter = 'C';
            case 21 -> letter = 'K';
            case 22 -> letter = 'E';
        }
        
        System.out.println("Letter: " + letter);

        teclado.close();
    }
}
