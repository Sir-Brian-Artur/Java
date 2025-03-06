package T07;

public class C_f {
    public static void main(String[] args) {
        boolean result = true;
        if (args.length != 2)
            result = false;
        else if (!args[0].equals(args[1]))
            result = false;
        else {
            int up = 0, low = 0;
            for (int i = 0; i < args[0].length(); i++) {
                if (Character.isUpperCase(args[0].charAt(i)))
                    up++;
                else if (Character.isLowerCase(args[0].charAt(i)))
                    low++;
            }
            if (low <= 1 || up <= 1)
                result = false;
        }
        System.out.println(result);
    }
}
/* Este programa da "false" al igual que el anterior. */
