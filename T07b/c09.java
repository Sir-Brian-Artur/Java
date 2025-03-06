package T07b;                   // Sólo faltaba el pasar de Array a ArrayList
                                
import java.util.ArrayList;
import java.util.Collections;

public class c09 {
    public static void main(String[] args) {
        ArrayList <Integer> x = new ArrayList <>(); 
        for (int i=0;i<5;i++) x.add((int)(Math.random()*100));
        Collections.sort(x);
        fun (x, 20);    // Coloca un 20 en la 1ra von un valor mayor a 20
        fun (x, 200);   // Coloca un 200 al final de todo
        fun (x, -1);      // Coloca un -1 al principio del Array
    }

    static void fun (ArrayList <Integer> a, int n) { 
        for (int i=0; i<a.size();i++) {
            if (a.get(i)>n) {
                a.add(i,n);
                return;
            }
        }
        a.add(n);
        
    }
}
