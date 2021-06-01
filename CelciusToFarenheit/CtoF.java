package CelciusToFarenheit;
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,f;
        System.out.print("Enter any Celcious value : ");
        c = input.nextDouble();
        f = 1.8*c + 32;
        System.out.println("Farahanhite Tempereture is : " +f);
        
    }
    
}
