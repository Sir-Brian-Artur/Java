package T07b.E18;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej0718 {
    static ArrayList <Integer> div;

    public static void main(String[] args) {
        div = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int num = sn.nextInt();
        int numPositive = Math.abs(num);
        
        int numDivisores = cuentaDivisores(num);

        for (int i = 1, j = 0; i <= numPositive && j < numDivisores; i++) {
            if (numPositive % i == 0) {
                if(num < 0){
                    div.add(-i);
                }else{
                    div.add(i);                    
                }
                j++;
            }
        }

        for (int i = 0; i < numDivisores; i++) {
            System.out.println(div.get(i));
        }

    }

    public static int cuentaDivisores(int numero) {
        int contador = 0;
 
        // Recorremos de 1 al número (incluido el propio numero)
        for (int i = 1; i <= Math.abs(numero); i++) {
            // si es divisible entre el número original, sumamos el contador
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador;
    }

}