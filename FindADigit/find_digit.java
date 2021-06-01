package FindADigit;

import java.util.Scanner;

public class find_digit {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;
        while(temp != 0){
            int r = temp%10;
            sum = sum+r;
            temp = temp/10;
            count++;            
        }
        System.out.println("Number is : "+count);
        System.out.println("Addition is : "+sum);
    }
}
