package T07.E05;

import java.util.Arrays;

public class Prog_2 {
    public static void main(String[] args) {
        Primitiva boletos = new Primitiva();
        System.out.println(Arrays.toString(boletos.getResultados()));
        int premiados = boletos.jugadaMultiple();
        System.out.println(premiados);
    }
}
