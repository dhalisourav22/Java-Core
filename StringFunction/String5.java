package StringFunction;

public class String5 {

    public static void main(String[] args) {
        String f_name = "Sourav ";
        String l_name = "Dhali";
        String full_name = f_name + l_name;
        String fullMathod = f_name.concat(l_name);   //concatination
        System.out.println("Full name is : " + full_name + 25);
        System.out.println("Full name is : " + fullMathod);
        String upperName = full_name.toUpperCase();  //making upper_case
        System.out.println("Upper case name is : " + upperName);
        String lowerName = full_name.toLowerCase();   //making lowerCase
        System.out.println("Upper case name is : " + lowerName);
        boolean b = full_name.startsWith("Sourav D");    //Matching starting latter
        System.out.println("b = " + b);
        boolean bb = full_name.endsWith("li");       //Matching Ending latter
        System.out.println("bb = " + bb);
    }
}
