package T04;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        String text;
        StringBuilder sumaText = new StringBuilder();

        do {
            System.out.println("Introduce texto");
            text = keyboard.nextLine();
            sumaText.append(text.charAt(0));
            i++;
        }
        while (i < 10);

        System.out.println(sumaText);
        keyboard.close();
    }
}
