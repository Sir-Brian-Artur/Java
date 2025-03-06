package T03;

public class E21 {
    public static void main(String[] args) {

        int ant = 1, ant2 = 0, num;

        for (int i = 1; i <= 12; i++) {
            num = ant + ant2;
            System.out.println(num);
            ant2 = ant;     // Tan sólo había que cambiar el orden 
            ant = num;      // de la nueva asignación de las variables.
            
            
        }
    }
}
