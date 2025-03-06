package T03;

public class E20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int divisores = 0;
            for (int j = 1; j <= 2; j++){
                if (i % j == 0) {
                    divisores += 2;
                }
                if (divisores > 2){
                    break;
                }
            }
            if (divisores == 2) {
                System.out.println(i);
            }
        }

        System.out.println("Fin del orden");
    }
}
