package AreaOfACircle;
import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double readious, area;
        System.out.print("Give me thge readious of your circle : ");
        readious = input.nextDouble();
        area = 3.1416 * readious;
        System.out.println("The area is : " +area);
        
        
    }
}
