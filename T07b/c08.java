package T07b;                   // Sólo faltaba el pasar de Array a ArrayList
                                
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c08 {
    public static void main(String[] args) {
        Integer [] arr = {10, 3, 7, 2, 9, 5}; //no fuciona con int 
        ArrayList <Integer> lista = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(lista);
        arr = lista.toArray(new Integer[lista.size()]); 
        System.out.println (Arrays.toString(arr));  

        
    }
}
