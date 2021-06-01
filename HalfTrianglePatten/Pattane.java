package HalfTrianglePatten;
import java.util.Scanner;
public class Pattane {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Enter how long you want to go: ");
        n = input.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
