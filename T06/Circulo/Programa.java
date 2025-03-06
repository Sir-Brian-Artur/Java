package T06.Circulo;

public class Programa {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

        circulo1.setRadio(4);

        System.out.println(circulo1.calcularCircunferencia());
        System.out.println(circulo2.calcularCircunferencia());
    }
}
