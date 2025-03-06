package T03;

public class E26d {
    public static void main(String[] args) {

        int i, j;

        for (i = 1 ; i <= 9; i++){
            for (j = 1; j <= i; j++){
                System.out.print(10 - j);
            }
            System.out.println();
        }
    }
}
