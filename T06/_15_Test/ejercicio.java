package T06._15_Test;

public class ejercicio {

    public static void main(String[] args) {
        Examen alejandroExamen = new Examen();
        
        alejandroExamen.setRespuestaCorrecta("abcdadbbcdadcdaddacb");

        alejandroExamen.pregunta('a');
        alejandroExamen.pregunta('b');
        alejandroExamen.pregunta('c');
        alejandroExamen.pregunta('c');


        System.out.println(alejandroExamen.getPuntuacion());
    }
}
