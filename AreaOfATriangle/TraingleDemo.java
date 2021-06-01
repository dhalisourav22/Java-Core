package AreaOfATriangle;

import java.util.Scanner;

public class TraingleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, base, area;
        System.out.print("Give me the Base : ");
        base = input.nextDouble();
        System.out.print("Give me the Height : ");
        height =  input.nextDouble();
        area = 0.5*base*height;
        System.out.println("Area of the traingle is : "+ area);
        
            }
}
