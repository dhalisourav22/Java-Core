package InOutTest;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        int i;
        char f;
        f= input.next().charAt(0);
        f= input.next().charAt(1);
        System.out.println("eNTER FLOAT NUMBER : " +f);
        
        System.out.printf("Enter any number : ");
        i = input.nextInt();
        String name;
        System.out.print("Enter your full name : ");
        name = input.nextLine();
        System.out.println(name);
    }
    
}
