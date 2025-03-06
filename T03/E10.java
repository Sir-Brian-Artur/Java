package T03;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        int age;
        boolean menor;

        Scanner teclado = new Scanner(System.in);
        menor = false;
        age = 0;

        while (age != -1) {
            System.out.print("Edad: ");
            age = teclado.nextInt();
            if (age != -1 && age < 18)
                menor = true;
        }
        if (menor == true) {
            System.out.println("Sí, hay alguno");
        } else {
            System.out.println("No, son todos adultos");
        }
        teclado.close();
    }
}
