package T04;       // INACABADO

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        Scanner teclado = new java.util.Scanner(System.in);
        
        double num;
        System.out.println("Introduce un número decimal");
        num = Double.parseDouble(teclado.nextLine());
        int digit = 0, digit2 = 0;
        String numeroString = String.valueOf(num);

        String subString = numeroString.substring(0, numeroString.indexOf('.') - 1);
        String subString2 = numeroString.substring(numeroString.indexOf('.') + 1);

        int sub1 = Integer.parseInt(subString);
        int sub2 = Integer.parseInt(subString2);

        StringBuilder hex1 = new StringBuilder();
        StringBuilder hex2 = new StringBuilder();

        while (sub1 > 0) {
            digit = sub1 % 16;
            switch (digit) {
                case 10 : digit = 'A'; break;
                case 11 : digit = 'B'; break;
                case 12 : digit = 'C'; break;
                case 13 : digit = 'D'; break;
                case 14 : digit = 'E'; break;
                case 15 : digit = 'F'; break;
                default : break;   
            } 
            hex1.insert(0, digit);
            sub1 = sub1 / 16;
        }

        while (sub2 > 0) {
            digit2 = sub2 % 16;
            switch (digit2) {
                case 10 -> digit2 = 'A';
                case 11 -> digit2 = 'B';
                case 12 -> digit2 = 'C';
                case 13 -> digit2 = 'D';
                case 14 -> digit2 = 'E';
                case 15 -> digit2 = 'F';
                    
            } 
            hex2.insert(0, digit2);
            sub2 = sub2 / 16;
        }

        System.out.println(hex1 + "." + hex2);

        teclado.close();
    }
}
