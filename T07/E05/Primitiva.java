package T07.E05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    private static int[] resultados;

    public Primitiva(){
        this.resultados = seisNum();
    }

    private static int[] seisNum() {
        resultados = new int[6];
        Random r = new Random();
        for(int i = 0 ; i < resultados.length ; i++) {
            boolean distinto;
            do {
                distinto = true;
                int newNum = r.nextInt(49) + 1;
    
                for (int j = 0; j < resultados.length; j++) {
                    if(newNum == resultados[j])
                        distinto = false;
                }
                if (distinto)
                    resultados[i] = newNum;
            } while (!distinto);
        };
        Arrays.sort(resultados);
        return resultados;
    }
    public int[] numeros(){
        Scanner nums = new Scanner(System.in);
        int[] numsJugada = new int[6];
        for (int i = 0; i < numsJugada.length; i++) {
            System.out.print("Introduce número: ");
            numsJugada[i] = Integer.parseInt(nums.nextLine());
        }
        Arrays.sort(numsJugada);
        return numsJugada;
    }
    public int jugada(){
        int cont = 0;
        int[] nums = numeros();
        for (int i = 0; i < nums.length; i++) {
            if (resultados[i] == nums[i]) cont++;
        }
        return cont;
    }

    public static int[] getResultados() {
        return resultados;
    }

    public int[] numAleatorios(){
        Random r = new Random();
        int[] numsJugada = new int[6];
        for(int i = 0 ; i < numsJugada.length ; i++) {
            boolean distinto;
            do {
                distinto = true;
                int newNum = r.nextInt(41);
    
                for (int j = 0; j < numsJugada.length; j++) {
                    if(newNum == resultados[j])
                        distinto = false;
                }
                if (distinto)
                    numsJugada[i] = newNum;
            } while (!distinto);
        };
        Arrays.sort(numsJugada);
        return numsJugada;
    }
    public int jugadaMultiple(){
        int cont;
        int premiados = 0;
        for (int i = 0; i < 10000000; i++) {
            cont = 0;
            int[] nums = numAleatorios();
            //System.out.println(Arrays.toString(nums));
            for (int j = 0; j < nums.length; j++) {
                if (resultados[j] == nums[j]) cont++;
            }
            if (cont >= 1) premiados++;
        }
        return premiados;
    }

}
