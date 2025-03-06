package T07;

import java.util.Arrays;

public class C_d {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(fun(arr)));
    }

    static int[] fun(int[] x) {
        int[] y = new int[x.length * 2];
        int cont = 0;
        for (int z : x) {
            y[cont++] = z; 
        }
        for (int z : x) {
            y[cont++] = z + y[x.length - 1]; 
        }
        return y;
    }
}

/* Sintacticamente está correcto. Pero si se quiere seguir la escala ascendente,
 * en vez de tener 1 "for" con 2 sentencias; hay que usar 2 "for" con 1 sentencia
 * cada uno. De esta forma se guardadn primero los valores del primer ciclo, y 
 * luego los del segundo.
 */
