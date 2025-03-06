package T07;

import java.util.Arrays;

public class C_a {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 21, 37, 40, 51 };
        int p = 0, i = 0;
        for (int x = 0; x < a.length; x++)
            if (x % 2 == 0)
                p += a[x];
            else
                i += a[x];
        System.out.printf("%d-%d\n", p, i);
        System.out.println(Arrays.toString(a));
    }
}

/* Es código no tiene ningún error de sintaxis. Lo que nos muestra es la la suma
 * de los valores en posición impar, por un lado, y par, por otro lado.
 * 
 * Con "Arrays.toString(array)" podemos manejar el array como a un String.
*/
