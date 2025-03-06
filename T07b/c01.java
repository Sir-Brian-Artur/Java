package T07b;

import java.util.ArrayList;

public class c01 {
    public static void main(String[] args) {
        
        ArrayList <Long> a = new ArrayList <>();
        for (int i=0;i<=9;i++)
            a.add((long)Math.pow(2,i+1));

        System.out.println(a);  //[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
    }
    
}
