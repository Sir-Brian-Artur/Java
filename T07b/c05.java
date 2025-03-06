package T07b;

import java.util.ArrayList;
import java.util.Collections;

public class c05 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < 6; i++) {
            do {
                n = (int) (Math.random() * 49) + 1;
            } while (a.contains(n));
            a.add(n);
        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));

        for (int i = 0; i < a.size(); i++) {    // Toma el valor de ese índice y lo
            a.set(i, a.get(i) +1);              // aumenta en 1.
        }
    }
}
