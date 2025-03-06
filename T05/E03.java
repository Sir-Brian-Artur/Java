package T05;

import java.util.Scanner;

public class E03 {  
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year, month;
        
        System.out.println("Año: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.println("Mes: ");
        month = Integer.parseInt(keyboard.nextLine());

        System.out.println(carcularDiasMes(year, month));
        keyboard.close();
    }

    static int carcularDiasMes (int y, int m) {
        if (m == 2) {
            if (esBisiesto(y)) return 29;
            return 28;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) return 30;
        return 31;
    }
    static  boolean esBisiesto (int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) return true;
        return false;
    }
}