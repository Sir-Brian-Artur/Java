package T07b;

import java.util.ArrayList;
import java.util.Collections;

public class c03 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();   // Crea un arrayList
        int lon = (int) (Math.random() * 6) + 5;    // Número del 5 al 11
        for (int i = 0; i < lon; i++)               // Rellena el arrayList con esa 
            a.add((int) (Math.random() * 100) + 1); // cantidad de números 1 - 100
        Collections.sort(a);                        // Ordena ascendentemente
        for (int i = 0; i < a.size(); i++)          // Imprime el ArrayList
            System.out.println(a.get(i));
    }

}
