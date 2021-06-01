package FactorialByLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, fact = 1;
        System.out.print("Entre The Value : ");
        n = in.nextInt();
        for(int i = n; i>=1; i--){
            fact*=i;
        }
        System.out.println("The number of "+n+" factorial is: "+fact);
    }
    
}
