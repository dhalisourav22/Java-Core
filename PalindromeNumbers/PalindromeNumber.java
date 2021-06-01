
package PalindromeNumbers;

import java.util.Scanner;

public class PalindromeNumber {
        public static void main(String[] args) {
        Scanner in= new Scanner(System . in);
        System.out.print("Enter any number : ");
        int num , temp, sum = 0;
        num = in.nextInt();
        temp = num;
        for(;temp != 0 ;){
            int i = temp%10;
            sum= sum*10 + i;
            temp = temp/10;
        }
        if(sum == num){
            System.out.println("The number is palindrom");
        }
        else{
            System.out.println("The number is not palindrom");
        }
        
    }
}
