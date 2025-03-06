package T04;

import java.util.Scanner;

public class E09b {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age;
        String fullName;

        System.out.println("Introduce Nombre y Apellidos");
        fullName = keyboard.nextLine();

        System.out.println("Introduce edad");
        age = Integer.parseInt(keyboard.nextLine());

        System.out.printf("Hola, me llamo %s y tengo %d años", fullName, age);
        keyboard.close();
    }
}
