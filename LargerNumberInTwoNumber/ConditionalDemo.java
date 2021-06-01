package LargerNumberInTwoNumber;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System . in);
        System.out.print("Give your first number : ");
        int i,j,l;
        i = input.nextInt();
        System.out.print("Enter your second number : ");
        j = input.nextInt();
        l = (i>j)? i :j ;
        System.out.println("Lerger number is: "+l);
    }
 
}
