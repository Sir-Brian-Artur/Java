package T03;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i;
        float note, max, min, mid, acum;
        boolean five;
        System.out.print("Nota: ");
        note = teclado.nextFloat();
        
        five = false;
        i = 0;
        min = note;
        max = note;
        acum = 0;
        mid = note;

        while (note != -1) {
            
            acum += note;  
            i++;
            if (note > max) max = note;
            if (note < min) min = note;
            if (note == 5.0) five = true;
            
            System.out.print("Nota: ");
            note = teclado.nextFloat();
            mid = acum / i;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Media: " + mid);
        if (five)
        System.out.println("Existe al menos un 5 pelao");
        teclado.close();
    }   
}
