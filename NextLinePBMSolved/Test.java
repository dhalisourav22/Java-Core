package NextLinePBMSolved;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,varsityName;
        System.out.print("Enter Your Univarsity Name: ");
        varsityName= input.next();
        System.out.println("University Name is: "+varsityName);
        input.nextLine();        //By Using That We remove the problem
        System.out.print("Enter Your Full Name: ");
        name = input.nextLine();
        System.out.println("Name is: "+name);
    }
}
