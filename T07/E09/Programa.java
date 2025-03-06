package T07.E09;

public class Programa {
    public static void main(String[] args) {
        
    }

    public double media(int[] arr){
        double m = 0;
        for (int i : arr) {
            m += i;
        }
        return m / arr.length;
    }

    public int[] adultos(int[] arr){
        int largo = 0;
        int[] al;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 17 ) largo++; 
        }

        int cont = 0;
        al = new int[largo];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 17) {
                al[cont] = arr[j];
                cont++;
            }
        }
        return al;
    }
}
