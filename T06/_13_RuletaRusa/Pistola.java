package T06._13_RuletaRusa;

public class Pistola {
    private int tambor;
    private int bala = 6;
    private int i = 0;

    public Pistola () {
        this.bala = (int) ((tambor * Math.random()) + 1);
    }

    public int getTambor() {
        return tambor;
    }
    public int getBala() {
        return bala;
    }

    public boolean martillear() {
        i++;
        return this.bala == i;

    }


}
