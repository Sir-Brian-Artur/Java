package T07b;                   // Crea un array de 10.000 posiciones para luego
                                // eliminar parte de sus valores. Esto debíera dejar 
import java.util.ArrayList;     // estadísticamente, la mitad de esos 10.000.

public class c07 {
    public static void main(String[] args) {

        ArrayList <Integer> a = new ArrayList <>();
        for (int i=0;i<10000;i++) {
           a.add((int)(Math.random()*1000)+1);
        }
        for (int i=0; i<a.size();i++)
            if (a.get(i)>= 250 & a.get(i) <= 750) a.remove(i); 
    }
}
