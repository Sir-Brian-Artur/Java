package T07b;                   // Puede tener valores mayores de 30. Ya que, si
                                // presenta un número negativo, lo va a pasar a positivo
import java.util.ArrayList;     
import java.util.Collections;

public class c06 {
    public static void main(String[] args) {

        ArrayList <Integer> a = new ArrayList <>();
        llenarArrayList (a);   //llena el arrayList con valores positivos y negativos
        for (int i=0;i<a.size();i++) {
            if (a.get(i)>30) a.set(i,30); 
            else a.set(i,Math.abs(a.get(i)));
        } 
    }
}
