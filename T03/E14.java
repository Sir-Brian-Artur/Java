package T03;

public class E14 {
    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++){
            int j, suma;
            j = 2;
            suma = 0;
            
            while (j <= i){
                if (i % j == 0){
                    suma += i / j;
                }
                j++;
            }
            if (suma == i)
                System.out.println(i);
        }
    }
}
