package T07;

import java.util.Arrays;

public class C_c {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length - 1; i+=1)
            arr[i] = arr[i + 1];
        System.out.println(Arrays.toString(arr));
    }
}
/* a. No se debe poner la logitud del Array cuando ya se está colocado sus valores
 * b. La condición del "for" está mal declarada. "length" es un atributo, no un
 *    método.
 * c. La actualización del "for" tambíen está mal. Hay que sustituirla por 
 *    "i+=1" o "i++"
 * d. En el código sale [20, 30, 40, 50, 50]
 */
