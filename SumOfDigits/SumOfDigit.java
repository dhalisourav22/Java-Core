package SumOfDigits;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in= new Scanner(System . in);
        System.out.print("Enter any number : ");
        int num , temp, sum = 0;
        num = in.nextInt();
        for(;num != 0 ;){
            int i = num%10;
            sum+=i;
            num = num/10;
        }
        System.out.println("Addition is : "+sum);
        
    }
    
}
