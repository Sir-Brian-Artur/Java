package T06.Circulo;

public class Circulo {
    private double radio = 5;       //Podemos dejar atributo privado

    public Circulo() {
        
    }

    public void setRadio(int radio) {
        this.radio = radio;
    } 

    public double getRadio() {
        return radio;
    }

    public double calcularCircunferencia() {
        return Math.PI * (2 * radio) ;
    }

    public double calcularSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double calcularDiametro() {
        return radio * 2;
    }
}
