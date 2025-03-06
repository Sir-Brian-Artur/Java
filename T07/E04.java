package T07;        // Incompleto

import java.util.Arrays;
import java.util.Random;

public class E04 {
    static int [] temperaturaMeses = new int[12];
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0 ; i < 3 ; i++) {
            temperaturaMeses[i] = r.nextInt(31) -10;
        };
        for(int i = 3 ; i < 10 ; i++) {
            temperaturaMeses[i] = r.nextInt(31) +10;
        };
        for(int i = 10 ; i < temperaturaMeses.length ; i++) {
            temperaturaMeses[i] = r.nextInt(31) -10;
        };
        System.out.println(Arrays.toString(temperaturaMeses));

    }
    
    static double temperaturaMedia() {
        double media = 0;
        for (int i = 0; i < temperaturaMeses.length; i++) {
            media += temperaturaMeses[i];
        }
        return media / temperaturaMeses.length;
    }
    static void mesesCalor() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30){
                System.out.println(temperaturaMeses[i]);
            }
        }
    }
    static boolean mesCaluroso() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30) 
            return true;
        }
        return false;
    }
    static boolean mesCaluroso2() {
        boolean mesCalorro = false;
        int i = 0;
        while (i < temperaturaMeses.length || mesCalorro == true) {
            if (temperaturaMeses[i] > 30) mesCalorro = true;
            i++;
        }
        return mesCalorro;
    }
    static boolean duplicados() {
        int [] clone = temperaturaMeses;
        int contador = 0;
        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone.length; j++) {
                if(clone[i] == clone[j])
                    contador++;
            }
        }
        return contador > 0;
    }
}
