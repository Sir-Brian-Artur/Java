package T03;

public class E27 {
    public static void main(String[] args) {

        int i, aux, d, t = 0;

        for (i = 1; i <= 10000; i++) {
            aux = i;

            if (i % 3 == 0) {
                System.out.println(i);
                d = Integer.toString(aux).length();
                for (int j = 0; j < d; j++) {
                    String num = String.valueOf(Integer.toString(aux).charAt(j));
                    t += Integer.parseInt(num);   
                }
                
                if (t % 3 == 0) System.out.println("la suma es: " + t + " (multiplo de 3)");
                t = 0;
            }
        }
    }
}
