package StringPremitive;

public class string_premitive {

    public static void main(String[] args) {
        int i = 120;
        String s = Integer.toString(i);
        System.out.println("String is : " + s);

        String ss = "32";
        int j = Integer.valueOf(ss);
        int k = Integer.parseInt(ss);

        System.out.println("Integer value is: " + j);

    }
}