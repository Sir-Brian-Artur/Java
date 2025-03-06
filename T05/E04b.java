package T05;

import java.util.Scanner;

public class E04b {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year, month, day, month2, day2;
        
        System.out.print("Año: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Mes: ");
        month = Integer.parseInt(keyboard.nextLine());
        System.out.print("Día: ");
        day = Integer.parseInt(keyboard.nextLine());
        System.out.print("Mes 2: ");
        month2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Día 2: ");
        day2 = Integer.parseInt(keyboard.nextLine());

        if (esBisiesto(year) && month != 1 && month != 2)
            System.out.println(diasPasados(month, day) + 1);
        else System.out.println(diasPasados(month, day));
        keyboard.close();
    }

    static int diasPasados (int month, int day) {
        int daysMonth = switch (month) {
            case 1 -> 31;
            case 2 -> 59;
            case 3 -> 90;
            case 4 -> 120;
            case 5 -> 151;
            case 6 -> 181;
            case 7 -> 212;
            case 8 -> 243;
            case 9 -> 273;
            case 10 -> 304;
            case 11 -> 334;
            case 12 -> 365;
            default -> 0;
        };
        return daysMonth - day;
    }
    static  boolean esBisiesto (int y) {
        return  ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }
}