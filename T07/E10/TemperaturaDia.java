package T07.E10;

import java.util.Random;

public class TemperaturaDia {
    public static void main(String[] args) {
        int[][] temperaturaDia = new int[12][30];
        Random r = new Random();

        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < temperaturaDia[i].length ; j++ ){
                temperaturaDia[i][j] = r.nextInt(31) -10;
            }
        };
        for(int i = 3 ; i < 10 ; i++) {
            for(int j = 0 ; j < temperaturaDia[i].length ; j++ ){
                temperaturaDia[i][j] = r.nextInt(31) +10;
            }
        };
        for(int i = 10 ; i < 12 ; i++) {
            for(int j = 0 ; j < temperaturaDia[i].length ; j++ ){
                temperaturaDia[i][j] = r.nextInt(31) -10;
            }
        };

        for (int[] i : temperaturaDia) {
            for (int j : i) {
                System.out.printf("%+3d ", j);
            }
            System.out.println("");
        }
        System.out.println("hola");
        
        float mediaAno = 0;
        for (int[] i : temperaturaDia) {
            for (int j : i) {
                mediaAno += j;
            }
        }
        mediaAno /= temperaturaDia[0].length * temperaturaDia.length;
        System.out.println("Media anual: " + mediaAno);

        for (int i = 0; i < temperaturaDia.length; i++) {
            float mediaMes = 0;
            for (int j = 0; j < temperaturaDia[i].length; j++) {
                mediaMes += j;
            }
            mediaMes /= temperaturaDia[0].length;
            System.out.println("Media del mes: " + mediaMes);
        }

        int[] minimas = new int[temperaturaDia.length];
        for (int m = 0; m < temperaturaDia.length ; m++) {
            int minMes = 41;
            for (int d = 0 ; d < temperaturaDia[m].length; d++) {
                if (temperaturaDia[m][d] < minMes) {
                    minMes = temperaturaDia[m][d];
                }
            }
            minimas[m] = minMes;
            System.out.println("Mínima del mes: " + minimas[m]);
        }
    }


}
