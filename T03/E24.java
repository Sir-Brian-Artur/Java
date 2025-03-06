package T03;

import java.util.Scanner;

public class E24 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        char sex = ' ';
        int age, young, ageFemales = 0, females = 0, i = 0;
        float midAgeFemale = 0f;
        boolean oldEmployee = false;
        young = 70;

        do {
            
            System.out.print("Edad: ");
            age = keyboard.nextInt();
            if (age == 0) break;
            
            while(age < 16 || age > 70){
                System.out.print("Edad incorrecta, introduce de nuevo: ");
                age = keyboard.nextInt();
            };

            if (age < young) young = age; 
            if (age > 60) oldEmployee = true;

            System.out.print("Sexo: ");
            sex = keyboard.next().charAt(0);

            if (sex == 'm'){
                ageFemales += age;
                females++;
                midAgeFemale = (float)ageFemales / females;
            }
            i++;
        }
        while (age >= 0 && i < 30);

        System.out.println("Edad del más joven: " + young);
        System.out.print(" con sexo " + sex);
        System.out.println("Media de edad de mujeres: " + midAgeFemale);
        System.out.println((oldEmployee) 
            ? "Hay mayores de 60" 
            : "Aquí no traban boomers"
        );
        
        keyboard.close();
    }
}
