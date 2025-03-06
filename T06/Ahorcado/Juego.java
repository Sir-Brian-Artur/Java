package T06.Ahorcado;

public class Juego {
    public static void main(String[] args) {
        Ahorcado juego1 = new Ahorcado("Mariposa");
        juego1.startGame();
        do {
            juego1.leerLetra();
            juego1.probarLetra();
            juego1.pintar();
        } while (juego1.adivinada());
        System.out.println("Enhorabuena");
    }
}