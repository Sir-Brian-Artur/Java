package T03;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);
        
        boolean order = true;
        int oldNum, num = 0;
        oldNum = 0;
        do {
            System.out.print("Nota (0 - 10): ");
            num = keybord.nextInt();
            if (oldNum < num) oldNum = num;
            else order = false;
        } 
        while (num != 0 && order == true);

        System.out.println("Fin del orden");
        keybord.close();
    }
}
