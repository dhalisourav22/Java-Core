package StringFunction;

public class String4 {
    public static void main(String[] args) {
        String s1 = "Sourav Dhali";
        String s2 =  new String("SOurav Dhali");
        System.out.println("S1 : "+s1);
        System.out.println("S3 : "+s2);
        System.out.println("SIZE : "+s1.length());
        boolean check = s1.equals(s2);
        System.out.println(check);
        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println("EQUAL : "+b);
        if(s1.contains("Sourav"))
            System.out.println("S1 and contain value are same");
        else
            System.out.println("they are not same");
        boolean bb =  s1.isEmpty();
        System.out.println("Is it emapty : "+bb);
    }
}
