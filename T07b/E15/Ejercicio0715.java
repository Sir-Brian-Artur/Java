package T07b.E15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio0715 {
    static Scanner sc;
    static AlturaAlumnos alturaAlumnos;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        alturaAlumnos = new AlturaAlumnos();
        char res; boolean exit = false;
        do { res = pintarMenu();
            switch (res) {
                case '1': añadirAltura(); break;
                case '2': mostrar(); break;
                case '3': eliminarPosicion(); break;
                case '4': eliminarValor(); break;
                case '5': vaciarLista(); break;
                case '6': exit = true; break;
                default: System.out.println("Opción inválida");
            }
            
        } while (!exit);
    }

    private static char pintarMenu(){
        char res;
        System.out.println("--------------------------\n");
        System.out.println("Elija una opción:");
        System.out.println(" 1 - Añadir altura");
        System.out.println(" 2 - Mostrar lista");
        System.out.println(" 3 - Eliminar por posición");
        System.out.println(" 4 - Eliminar por valor");
        System.out.println(" 5 - Vaciar lista");
        System.out.println(" 6 - Salir del programa");
        System.out.println("--------------------------\n");
        res = sc.next().charAt(0);
        sc.nextLine();  // Limpiar buffer de Scanner
        return res;
    }

    static void añadirAltura(){
        System.out.println("Introduzca la altura");
        double edad = sc.nextDouble();
        boolean res = alturaAlumnos.añadirAltura(edad);
        if (res) System.out.println("Edad introducida correctamente");
        else System.out.println("Edad errónea");
    }

    static void eliminarPosicion(){
        System.out.println("Introduzca posición a borrar:");
        int pos = sc.nextInt();
        boolean res = alturaAlumnos.eliminarPosicion(pos);
        if (res) System.out.println("Eliminado correctamente");
        else System.out.println("Elemento no encontrado");
    }
    static void eliminarValor(){
        System.out.println("Introduzca valor a borrar:");
        double val = sc.nextDouble();
        int cont = alturaAlumnos.eliminarValor(val);
        System.out.println("Se han eliminado " + cont + " elementos");
    }

    static void vaciarLista(){
        alturaAlumnos.vaciarLista();
        System.out.println("Lista vaciada");
    }

    static void mostrar(){
        ArrayList <Double> temp = alturaAlumnos.mostrarLista();
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(i + " - " + temp.get(i));
        }
    }
}

