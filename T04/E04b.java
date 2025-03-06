package T04;

public class E04b {
    public static void main(String[] args) {

        int largo = (int)((Math.random() * 5) + 5);
        StringBuilder pass = new StringBuilder("");
        for (int i = 0; i < largo; i++) {
            int num = (int)(Math.random() * 10);
            char letra = ' ';
            switch (num) {
                case 0 : letra = 'a'; break;
                case 1 : letra = 'b'; break;
                case 2 : letra = 'c'; break;
                case 3 : letra = 'd'; break;
                case 4 : letra = 'e'; break;
                case 5 : letra = 'f'; break;
                case 6 : letra = 'g'; break;
                case 7 : letra = 'h'; break;
                case 8 : letra = 'i'; break;
                case 9 : letra = 'j'; break;
            };
            
            pass.insert(i, letra); 
              
        }
        System.out.println(pass);
    }
}
