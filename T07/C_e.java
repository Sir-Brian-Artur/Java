package T07;

public class C_e {
    public static void main(String[] args) {
        boolean result = true;
        if (args.length != 2)
            result = false;
        else if (!args[0].equals(args[1]))
            result = false;
        System.out.println(result);
    }
}
