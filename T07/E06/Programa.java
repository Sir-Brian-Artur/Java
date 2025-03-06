package T07.E06;

import java.util.Scanner;

public class Programa {
    static Parking p;
    static Scanner teclado;
    public static void main(String[] args) {
        p = new Parking();
        teclado = new Scanner(System.in);
        boolean salir = false;
        char opcion;                // --- Menú wapérrimo ---
        do {
            System.out.println("\n\n---- GETION PARKING LIFO ----");
            System.out.println("a) Mostrar parking \nb) Aparcar \nc) Desaparcar \nd) Plazas libres \ne) Salir ");
            opcion = teclado.next().charAt(0);
            switch (opcion){
                case 'a': p.getPlazas(); break;
                case 'b': p.aparcar(); break;
                case 'c': p.desaparcar(); break;
                case 'd': p.getNumPlz(); break;
                case 'e': salir = true; break;
                default: System.out.println("Opción inválida"); 
            }
        } while (!salir);
    }
}
