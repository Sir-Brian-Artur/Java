package T07b;

import java.util.ArrayList;

public class c02 {
    public static void main(String[] args) {

        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i <= 9; i++)
            a.add((long) Math.pow(2, i + 1));

        Long num = 999l;
        for (int i = 0; i < a.size(); i += 2)
            a.set(i, num);

        System.out.println(a);   //[999, 4, 999, 16, 999, 64, 999, 256, 999, 1024]
    }

}
