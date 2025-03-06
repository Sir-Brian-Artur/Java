package T06.Movil;

public class MovilPrepago {
    private long numeroMovil;
    private float costeMinutoLlamada;
    private float costeConsumoMB;
    private float saldo;

    public MovilPrepago(long nM, float cML, float cMB, float s) {
        this.numeroMovil = nM;
        this.saldo = s;
        this.costeMinutoLlamada = cML;
        this.costeConsumoMB =  cMB;
    }
    public MovilPrepago() {
        this.numeroMovil = 000000000;
        this.saldo = 0;
        this.costeMinutoLlamada = 0;
        this.costeConsumoMB = 0;
    }

    public void efectuarLlamada(int segundos) {
        saldo -= (float)segundos * costeMinutoLlamada / 60;
        consultarSaldo();
    }

    public void navegar(int MB) {
        saldo -= MB * costeConsumoMB;
        consultarSaldo();
    }

    public void recargar (int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            System.out.println("Operación exitosa");
        } else System.out.println("Importe no permitido");
        consultarSaldo();
    }
    public void consultarSaldo() {
        double saldoRedondeado = Math.round(this.saldo * 100)/100d;
        System.out.println("Saldo actual: " + saldoRedondeado + "$");
    }
}
