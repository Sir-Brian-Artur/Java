package T04;            
                   
public class E12 {
    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        String pass = new String();
        int times;

        do {
            times = 0;
            System.out.println("Introduce contraseña (6 dígitos): ");
            pass = teclado.nextLine();
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i)) == false)
                    times++;
            }
        }
        while (pass.length() != 6 || times != 0);

        System.out.print("Su contraseña es: " + pass);

        teclado.close();
    }
}
