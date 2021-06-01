package SumOfMtoNNumber;
import java.util.Scanner;
public class SumOfMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m , n ,sum =0;
        System.out.print("Give the first number : ");
        m = input.nextInt();
        System.out.print("Give the second number : ");
        n = input.nextInt();
        for(int i = m; i<=n; i++){
            if(i%2 == 0)
            sum = sum + i;            
        }
        System.out.println(sum);
    }
}
