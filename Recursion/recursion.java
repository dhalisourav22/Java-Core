package Recursion;

import java.util.Scanner;

public class recursion {
    int fact(int num){
        if(num == 0)
            return 1;
        else
            return num*fact(num-1);        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int i;
        i = input.nextInt();
        recursion ob = new recursion();
        int result = ob.fact(i);
        System.out.println("Factorial is : "+result);
    }
}
