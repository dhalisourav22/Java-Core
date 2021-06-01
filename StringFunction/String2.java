package StringFunction;

public class String2 {
    public static void main(String[] args) {
        String n = "            Sourav Dhali          ";
        String name = n.trim();
        System.out.println("Name is : " +name);
        char ch = name.charAt(2);
        System.out.println("Index 2 charter is : "+ch);
        int value = name.codePointAt(2);
        System.out.println("Asci value of index 2 is : "+value);
        int inNumber = name.indexOf('r');
        System.out.println("the charecter of r index is : "+inNumber);
        int lastNumber = name.lastIndexOf('a');
        System.out.println("the charecter of a index is : "+lastNumber);       
        
    }
}
