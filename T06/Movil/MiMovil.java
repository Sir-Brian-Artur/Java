package T06.Movil;

import java.util.Scanner;

public class MiMovil {
    static Scanner keyboard;
    static MovilPrepago movil2;
    public static void main(String[] args) {

        MovilPrepago movil1 = new MovilPrepago(900900900l, 0.1f, 0.5f, 10f);

        movil1.recargar(10);
        movil1.efectuarLlamada(30);
        movil1.navegar(10);
  
        altaMovil();
        operacion();
    }

    static void altaMovil() {
        keyboard = new Scanner(System.in);
        long numeroMovil;
        float costeMinutoLlamada, costeConsumoMB, saldo;
        System.out.print("Número de movil: ");
        numeroMovil = Long.parseLong(keyboard.nextLine());
        System.out.print("Coste minutos: ");
        costeMinutoLlamada = Float.parseFloat(keyboard.nextLine());
        System.out.print("Coste MB: ");
        costeConsumoMB = Float.parseFloat(keyboard.nextLine());
        System.out.print("Saldo inicial: ");
        saldo = Integer.parseInt(keyboard.nextLine());

        movil2 = new MovilPrepago(numeroMovil, costeMinutoLlamada, costeConsumoMB, saldo);
    }

    static int modeloMenu() {
        System.out.println("Seleccione una operacion:");
        System.out.println("1 : Recargar saldo");
        System.out.println("2 : Realizar llamada");
        System.out.println("3 : Navegar por internet");
        System.out.println("0 : Salir del programa");
        return Integer.parseInt(keyboard.nextLine());
    }

    static void operacion(){
        keyboard = new Scanner(System.in);
        boolean salir = false;
        int option, value;
        do {
            option = modeloMenu();
            switch (option) {
                case 1 : {
                    System.out.print("Importe (multiplo de 5): ");
                    value = Integer.parseInt(keyboard.nextLine());
                    movil2.recargar(value);
                } break;
                case 2 : {
                    System.out.print("Duraciónde la llamada (segundos): ");
                    value = Integer.parseInt(keyboard.nextLine());
                    movil2.efectuarLlamada(value);
                } break;
                case 3 : {
                    System.out.print("Cantidad de MB consumidos: ");
                    value = Integer.parseInt(keyboard.nextLine());
                    movil2.navegar(value);
                } break;
                case 0 : salir = true; break;
                default: System.out.println("Vaya pringao...");
            }
        }
        while (!salir);
        System.out.println("FIN.");
    }
}
