package T07;

import java.util.Arrays;
import java.util.Random;

public class E01 {
    static int [] temperaturaMeses = new int[12];
    public static void main(String[] args) {
        int x = 0;
        Random r = new Random();
        for(int i = 0 ; i < temperaturaMeses.length ; i++) {
            temperaturaMeses[i] = r.nextInt(41);
        }
        int [] arrInverso = new int[temperaturaMeses.length];

        for(int i = temperaturaMeses.length -1 ; i >= 0 ; i--){
            arrInverso[x] = temperaturaMeses[i];
            x++;
        }
        
        System.out.println(Arrays.toString(temperaturaMeses));
        System.out.println(Arrays.toString(arrInverso));

    }
}
