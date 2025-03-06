package T05;

import java.util.Scanner;

public class E04 {  
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year, month1, day1, month2, day2;
        
        System.out.print("Año: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Mes 1: ");
        month1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Día 1: ");
        day1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Mes 2: ");
        month2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Día 2: ");
        day2 = Integer.parseInt(keyboard.nextLine());

        int numDays = DiasIntermedios(year, month1, day1, month2, day2);
        System.out.println(numDays + " días");
        
        keyboard.close();
    }

    static int DiasIntermedios (int year, int month1, int day1, int month2, int day2) {
        if (month2 > month1)
            return DiasPasados(year, month2, day2) - DiasPasados(year, month1, day1);
            return DiasPasados(year, month1, day1) - DiasPasados(year, month2, day2);   
    }
       

    static int DiasPasados (int year, int month, int day) { 
        boolean leap = false;
        
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) leap = true;
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
        if (leap && month != 1 && month != 2) return daysMonth - day + 1;
        return daysMonth - day; 
    }
}