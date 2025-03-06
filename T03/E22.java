package T03;

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int salary, extraHours, sales, extraSalary, finalSalaryMaxSales, maxSales, totalSales;
        boolean otherEmployee = true;
        extraHours = 0;
        sales = 0;
        extraSalary = 0;
        maxSales = 0;
        totalSales = 0;

        System.out.print("Sueldo base de los empleados: ");
        salary = keyboard.nextInt();

        finalSalaryMaxSales = 0;

        do {
            System.out.print("Horas extra del empleado: ");
            extraHours = keyboard.nextInt();

            System.out.print("Número de ventas: ");
            sales = keyboard.nextInt();
            totalSales += sales; 

            if (sales > 30) extraSalary = 1300;
            else if (sales > 20) extraSalary = 1000;
            else if (sales > 9) extraSalary = 500;
            else extraSalary = 0;

            if (sales > maxSales) {
                maxSales = sales;
                finalSalaryMaxSales = salary + extraHours * 100 + extraSalary;
            }

            System.out.print("Otro empreado? ");
            otherEmployee = keyboard.nextBoolean();
        }
        while (otherEmployee == true);

        System.out.println("Salario del mayore vendedor: " + finalSalaryMaxSales);
        System.out.println("Ventas del mes: " + totalSales);
        
        keyboard.close();
    }
}
