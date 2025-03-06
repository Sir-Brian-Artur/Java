package T07.E07;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Parking2 {
    private Coche[] plazas;
    private int numPlz;
    private static final int MAXPLAZAS = 20;
    private double beneficio = 0d;

    Parking2(){
        plazas = new Coche[MAXPLAZAS];
        this.numPlz = 0;
    }

     public Coche[] getPlazas() {
        String[] p = new String[numPlz * 2];
        System.arraycopy(this.plazas, 0, p, 0, this.numPlz);
        return plazas;
    }

    public int aparcar(){
        if (numPlz == 20) return plazas.length - numPlz;
        
        this.numPlz++;
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero de matricula");
        this.plazas[numPlz] = new Coche (teclado.nextLine());
        
        teclado.close();
        return numPlz;
        
    }
    public Coche desaparcar(){
        long tiempo; double aPagar;
        if (this.numPlz == 0) return null;
        
        tiempo = ChronoUnit.SECONDS.between(this.plazas[this.numPlz].horaLlegada, LocalDateTime.now());
        
        aPagar = tiempo * 0.02;
        if (aPagar > 30) aPagar = 30;
        this.plazas[this.numPlz].importePagar = aPagar;
        this.numPlz--;
        this.beneficio += aPagar;

        return this.plazas[this.numPlz + 1];
    }

    public int getNumPlz() {
        return plazas.length - numPlz;
    }

    public double getBeneficio() {
        return beneficio;
    }
}
