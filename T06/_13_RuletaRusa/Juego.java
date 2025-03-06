package T06._13_RuletaRusa;

public class Juego {

    static Pistola juego = new Pistola();
    public static void main(String[] args) {
        System.out.println(juego.getBala());
        System.out.println(finJuego());
    }   
    
    static String finJuego() {
        if (juego.getBala() % 2 == 0){
            return "Gana el jugador 1";
        } else return "Gana el jugador 2";
    }
}
