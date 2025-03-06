package T07b.E17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio0717 {
    static Scanner sc;
    static Primitiva primitiva;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        primitiva = new Primitiva();
        char res; boolean exit = false;
        do { res = pintarMenu();
            switch (res) {
                case '1': comprobarAciertos(); break;
                case '2': jugarMilBoletos(); break;
                case '3': jugarHastaGanar(); break;
                case '4': exit = true; break;
                default: System.out.println("Opción inválida");
            }
            
        } while (!exit);
    }

    private static char pintarMenu(){
        char res;
        System.out.println("--------------------------\n");
        System.out.println("Elija una opción:");
        System.out.println(" 1 - Probar suerte");
        System.out.println(" 2 - Vender un riñon y parte del hígado");
        System.out.println(" 3 - Endeudarse más de España");
        System.out.println(" 4 - Salir");
        System.out.println("--------------------------\n");
        res = sc.next().charAt(0);
        sc.nextLine();  // Limpiar buffer de Scanner
        return res;
    }

    static ArrayList <Integer> jugarUnBoleto(){
        ArrayList <Integer> boleto = new ArrayList<>();
        boolean correcto;
        System.out.println("Introduzca 6 números del 1 al 49");
        for (int i = 0; i < 6; i++) {
            do {
                correcto = false;
                System.out.print(i + 1 + ": ");
                int num = sc.nextInt();
                if (num < 1 || num > 49) {
                    System.out.println("Número incorrecto");
                } if (boleto.contains(num)){
                    System.out.println("Número repetido");
                } else {
                    boleto.add(num);
                    correcto = true;
                }
            } while (!correcto);
        }
        return boleto;
    }

    static void comprobarAciertos(){
        ArrayList <Integer> boleto = jugarUnBoleto();
        int aciertos = primitiva.comprobarAciertos(boleto);
        System.out.println("Número de aciertos: " + aciertos);
        System.out.println("Siga intentándolo");
    }

    static void jugarMilBoletos(){
        int premiados = primitiva.jugarMilBoletos();
        System.out.println("Boletos premiados: " + premiados);
    }

    static void jugarHastaGanar(){
        int jugados = primitiva.jugarHastaGanar();
        System.out.println("Boletos empleados: " + jugados);
    }
}