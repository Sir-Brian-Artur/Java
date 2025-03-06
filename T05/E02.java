package T05;

import java.util.Scanner;

public class E02 {
    static Scanner keyboard;

    public static void main (String[] args) {
        keyboard = new Scanner(System.in);
        boolean salir = false;
        char option;
        do {
            option = pintarMenu();
            switch (option) {
                case 'a' : areaCirculo(); break;
                case 'b' : areaCuadrado(); break;
                case 'c' : areaTriangulo(); break;
                case 'x' : salir = true; break;
                default: System.out.println("Vaya pringao...");
            }
        }
        while (!salir);
        System.out.println("FIN.");
    }

    static char pintarMenu() {
        System.out.println("Seleccione un programa:");
        System.out.println("a : area de círculo");
        System.out.println("b : area de cuadrado");
        System.out.println("c : area de triángulo");
        System.out.println("x : salir del programa");
        return Character.valueOf(keyboard.nextLine().charAt(0));
    }

    static void areaCirculo () {
        System.out.print("Radio: ");
        double radio = Double.parseDouble(keyboard.nextLine());

        double area = Math.pow(radio * Math.PI, 2);
        System.out.println(area);
    }

    static void areaCuadrado () {
        System.out.print("Lado: ");
        double lado = Double.parseDouble(keyboard.nextLine());

        double area = lado * lado;
        System.out.println(area);
    }      
    
    static void areaTriangulo () {
        System.out.print("Base: ");
        double base = Double.parseDouble(keyboard.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(keyboard.nextLine());

       double area = base * altura;
        System.out.println(area);
    }
}