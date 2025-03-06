package T05;

public class E07 {
    public static void main(String[] args) {
        System.out.println(sumaPrimos());
    }

    static int sumaPrimos() {

        int suma = 2, i = 0, j = 2;
        while (i < 1000){
            ++j;
            
            if (j % 2 != 0) {
                if (esPrimo(j)) {
                    suma += j;
                    ++i;
                }    
            }
            
        }
        return suma;
    }

    static boolean esPrimo (int j) {
        for (int i = 3; i * i <= j; i += 2) {
            if (j % i == 0){
                return false;
            }
        }
        return true;
    }

}