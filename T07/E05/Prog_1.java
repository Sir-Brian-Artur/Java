package T07.E05;


import java.util.Arrays;

public class Prog_1 {
    public static void main(String[] args) {
        Primitiva boleto = new Primitiva();

        int numAciertos = boleto.jugada();
        
        System.out.println(Arrays.toString(boleto.getResultados()));
        System.out.println(numAciertos);

    }
}
