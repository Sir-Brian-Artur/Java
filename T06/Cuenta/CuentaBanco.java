package T06.Cuenta;

import java.util.Scanner;

public class CuentaBanco {
    static Scanner keyboard;
    static CuentaCorriente cuenta1;
    static CuentaCorriente cuenta2;
    static CuentaCorriente cuentaActiva; 
    public static void main(String[] args) {
        cuenta1 = new CuentaCorriente("ES010001");
        cuenta2 = new CuentaCorriente("ES020002");
        cuentaActiva = cuenta1;
        
        cuentaActiva. setComision(0.6f);
        float comision = cuentaActiva.getPorcentajeComision();

        System.out.println(comision);
        
        //operacionBancaria();
    }

    static int modeloMenu() {
        System.out.println("Seleccione una operacion:");
        System.out.println("1 : Ingresar dinero");
        System.out.println("2 : Retirar dinero");
        System.out.println("3 : Cunsultar saldo");
        System.out.println("4 : Cambio de cuenta");
        System.out.println("0 : Salir del programa");
        return Integer.parseInt(keyboard.nextLine());
    }

    static void operacionBancaria(){
        keyboard = new Scanner(System.in);
        boolean salir = false;
        int option;
        float value;
        do {
            option = modeloMenu();
            switch (option) {
                case 1 : {
                    value = datos();
                    cuentaActiva.ingresar(value);
                } break;
                case 2 : {
                    value = datos();
                    cuentaActiva.retirar(value);
                } break;
                case 3 : {
                    System.out.println(cuentaActiva.getSaldo());
                } break;
                case 4 : {
                    if (cuentaActiva == cuenta1) cuentaActiva = cuenta2;
                    else cuentaActiva = cuenta1;
                }
                case 0 : salir = true; break;
                default: System.out.println("Vaya pringao...");
            }
        }
        while (!salir);
        System.out.println("FIN.");
    }

    static float datos() {
        System.out.print("Importe: ");
        return Float.parseFloat(keyboard.nextLine());
    }
}
