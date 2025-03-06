package T05;                // Saldo vale 10 al finalizar el programa
                            // ya que al hacer la comprobación, de la condición,
                            // se está modificando el valor de "saldo"
public class E09 {
    public static int saldo = 0;

    public static void main(String[] args) {
        boolean ok = false;
        ingresar(30);
        
        if (retirar(10) == ok)
            System.out.println("No se puede retirar tanto");
        System.out.println("Saldo final: " + saldo);
    }

    static void ingresar(int i) {
        saldo += i;
    }

    static boolean retirar(int i) {
        if (i < saldo) {
            saldo -= i;
            return true;
        }
        return false;
    }
}