package T05;

import java.util.Scanner;

public class E05 {  
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número (1-20): ");
        num = Integer.parseInt(keyboard.nextLine());

        while (num > 0 && num <= 20){
            System.out.println(NumFactorial(num));
            System.out.println("Introduce un número (1-20): ");
            num = Integer.parseInt(keyboard.nextLine());
        }
        System.out.println("FIN");

        
        keyboard.close();
    }

    static int NumFactorial(int num) {
        int acumulator = 1;
        for (int i = 1; i <= num; i++){
            acumulator *= i;
        }
        return acumulator;
    }
    
}