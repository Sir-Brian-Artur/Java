package T03;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);
        
        int note, i, failedSubject;
        i = 0;
        note = 0;
        failedSubject = 0;

        do {
            System.out.print("Nota (0 - 10): ");
            note = keybord.nextInt();

            if (note < 0 || note > 10) {
                System.out.println("Valor incorrecto");
                i--;
            }

            switch (note) {
                case 0,1,2,3,4 -> failedSubject++;        
            }

            i++;
        } 
        while (i < 9);

        if (failedSubject > 0) 
            System.out.println("No pasas, tienes " + failedSubject + " asignaturas suspensas");
        else 
            System.out.println("Pasas al grupo de los guays ");

        keybord.close();
    }
}
