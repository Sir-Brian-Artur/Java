package T06._15_Test;

public class Examen {
    private double puntuacion;
    private int contador;
    private String respuestaCorrecta;

    public Examen() {
        this.puntuacion = 0;
        this.contador = -1;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setRespuestaCorrecta(String res) {
        if (res.length() == 20) this.respuestaCorrecta = res;
        else System.out.println("Cantidad de reguntas inadecuada");
    }

    public double pregunta(char res) {
        contador++;
        if (res == 'z') return puntuacion;
        if (respuestaCorrecta.charAt(contador) == res) return puntuacion += 0.5;
        else if (puntuacion <= 0.1)return puntuacion;
        return puntuacion -= 0.2;
    } 
}
