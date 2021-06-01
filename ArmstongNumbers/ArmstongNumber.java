package ArmstongNumbers;

import static java.lang.Math.pow;
import java.util.Scanner;

public class ArmstongNumber {
     public static void main(String[] args) {
        Scanner in= new Scanner(System . in);
        System.out.print("Enter any number : ");
        int num , temp;
        double sum = 0;
        num = in.nextInt();
        temp = num;
        for(;temp != 0 ;){
            double i = temp%10;
            sum=sum + pow(i,3);
            temp = temp/10;
        }
        if(num == sum){
            System.out.println("Armstong number");
        }
        else{
            System.out.println("not Armstong number");
        }
        
    }
    
}
