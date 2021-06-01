package InputDemos;
import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String name;
        name = input.next();
        System.out.println("Welcome : "+name);

        String name1;
        name1 = input.nextLine();
        System.out.println("Welcome : "+name1);
        
                int b;
        System.out.print("Enter what you think : ");
        b = input.nextInt();
    }    
}
