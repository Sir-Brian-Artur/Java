package T06.Ahorcado;

import java.util.Scanner;

public class Ahorcado {
    private String txtAdivinar;
    private String txtPista;
    public static Scanner keyBoard;
    private int numIntentos;
    private boolean adivinada;
    private int huecos = txtAdivinar.length();
    private StringBuilder txtJugador;
    StringBuilder tablero = new StringBuilder(huecos);


    //Constructor
    public Ahorcado(String txtAdivinar, String txtPista) {
        this.txtAdivinar = txtAdivinar;
        this.txtPista = txtPista;
        this.numIntentos = 0;   
        startGame();     
    }
    public Ahorcado(String txtAdivinar){
        this.txtAdivinar = txtAdivinar;
        this.numIntentos = 0;
        startGame();
    }
    // Inicia el juego con tablero vacío
    public void startGame() {
        for (int i = 0; i < huecos; i++) {
            tablero.append('_');
        }
        System.out.println(tablero);
    }
    // Jugador prueba letra
    public char leerLetra() {
        keyBoard = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        char letter = keyBoard.nextLine().charAt(0);
        numIntentos++;
        return letter;
    }
    // Maquina comprueba
    public boolean probarLetra() {
        char letra = leerLetra();
       if (txtAdivinar.indexOf(letra) != -1) {
           System.out.println("Correcto");
           return true;
       } else System.out.println("oh vaya");
       return false;
   }

    public boolean adivinada() {
        tablero.toString();
        return tablero.equals(txtAdivinar);
    }

    public boolean perdido(int intentosMax) {
        if (numIntentos == intentosMax) {
            return true;
        } return false;
    }

    
    private void jugada() {
        tablero.setCharAt(txtAdivinar.indexOf(leerLetra()), leerLetra());
    }

    public void pintar() {
        System.out.println(tablero);
    }



}
