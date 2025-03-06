package T06.NIM;

import java.util.Random;

public class Nim {
    private int juego;
    private int palosFila;
    private int fila;
    private int cantidad;
    private int palosTotal;

    public Nim() {};

    public boolean juega(int fila, int cant){
        if (cant > palosFila) return false;
        return true;
    }

    public boolean fin() {
        return palosTotal == 1;
    }

    private int piensa() {
        Random rand = new Random();
        String f = Integer.toString(rand.nextInt(3));
        String p = Integer.toString(rand.nextInt(7)+1);
        int numAl = Integer.parseInt(f.concat(p));
        return numAl;
    }
}
