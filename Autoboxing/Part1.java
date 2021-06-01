package Autoboxing;

public class Part1 {
    public static void main(String[] args) {
        int x = 10 ;
        Integer y = x; //Autoboxing
        Integer z = Integer.valueOf(x);
        System.out.println("Y : "+y);
        System.out.println("Z : "+z);
        
        Double d = new Double(12.50);
        double dd = d.doubleValue();
        System.out.println("DD : "+dd);
        double ddd = d;
        System.out.println("DDD : "+ddd);
        
    }
    
}
