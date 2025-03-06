package T03;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);
        
        int numRand, numSelec, i;
        i = 0;
        boolean truth = false;
        numRand = (int)(Math.random() * 100);

        do {
            System.out.print("Número (0 - 99): ");
            numSelec = keybord.nextInt();
            i++;
            if (numSelec == numRand) truth = true;     
        } 
        while (truth == false && i < 5);

        if (truth == true) 
            System.out.println("Congratulations!!");
        else 
            System.out.println("Bad luck, the number was " + numRand);

        keybord.close();
    }
}
