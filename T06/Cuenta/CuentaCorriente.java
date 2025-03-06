package T06.Cuenta;

public class CuentaCorriente {
    private float saldo;
    private float contadorIngresos = 0;
    private float porcentajeComision;
    public String iban;

    public CuentaCorriente(String iban, float porcComision) {
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = porcComision;
    }
    public CuentaCorriente(String iban) {
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = 0.1f;
    }

    public void ingresar(float cantidad){
        this.saldo += cantidad;
        System.out.println("Saldo actual: " + saldo);
    }

    public boolean retirar(float cantidad) {
        if (saldo > cantidad + (cantidad * porcentajeComision)){
            saldo -= cantidad - (cantidad * porcentajeComision);
            System.out.println("Saldo actual: " + saldo);
            return true;
        }
        System.out.println("Operación erronea");
        return false;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setComision(float cmsn) {
        this.porcentajeComision = cmsn;
    }

    public float getPorcentajeComision() {
        return this.porcentajeComision;
    }
}
