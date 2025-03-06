package T04;            //Comprueba si el texto introducido tiene o no espacios.
                        //En caso de que los tenga, los elimina.
public class E11 {
    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();

        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1)
                cadenaSB.deleteCharAt(pos);
        } while (pos != -1);
        System.out.println(cadenaSB);

        teclado.close();
    }
}
