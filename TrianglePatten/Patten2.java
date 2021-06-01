package TrianglePatten;

import java.util.Scanner;

public class Patten2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Enter how long you want to go: ");
        n = input.nextInt();
        int y ;
        y=n;
        for (int i = 1; i<=y; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            for(int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
