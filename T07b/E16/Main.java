package T07b.E16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        ArrayList <Integer> positivos;
        positivos = new ArrayList<>();
        ArrayList <Integer> negativos;
        negativos = new ArrayList<>();

        int num;
        do {
            System.out.print("Nuevo numero: ");
            num = Integer.parseInt(sc.nextLine());
            if(num > 0){
                positivos.add(num);
            }
            if (num < 0) {
                negativos.add(num);
            }
        } while (num != 0);
        double mediaPos = mediaArray(positivos);
        double mediaNeg = mediaArray(negativos);
        System.out.println("Positivos: " + mediaPos);
        System.out.println("Negativos: " + mediaNeg);
    }

    static double mediaArray(ArrayList arr){
        double media = 0;
        for (int i = 0; i < arr.size(); i++) {
            media += (int) arr.get(i);
        } 
        return media / arr.size();
    }
}
