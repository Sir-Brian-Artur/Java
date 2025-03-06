package T07.E06;

import java.util.Scanner;

public class Parking {
    private int numPlz;
    private int[] plazas;
    private static final int MAXPLAZAS = 20;
    
    public Parking(){
        plazas = new int[MAXPLAZAS];
        numPlz = 0;
    }
    
    public int[] getPlazas() {
        int[] plzs = new int[this.numPlz];
        for (int i = 0; i < this.numPlz; i++) {
            plzs[i] = this.plazas[i];
        }
        return plzs;
    }

    public int aparcar(){
        if (numPlz == 20) return plazas.length - numPlz;

        this.numPlz++;
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero de matricula");
        int matricula = Integer.parseInt(teclado.nextLine());
        plazas[numPlz] = matricula;
        teclado.close();
        return numPlz;
        
    }
    public int desaparcar(){
        if (numPlz == 0) return 0;
        int coche = plazas[numPlz];
        plazas[numPlz] = 0;
        this.numPlz--;
        return coche;
    }

    public int getNumPlz() {
        return plazas.length - numPlz;
    }

}
