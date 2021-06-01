package ArrayAllFunction;
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String[] name = {"Sourav", "Sabuj","Sajib","Abhijit"};
        for (String x: name) {          //For each loop
            System.out.println("Name is : " +x);
        }
        int[] num = {10,12,13,14,15,16,17,18,19};
        int sum = 0;
        for(int y : num){
            sum += y;
        }
        System.out.println("addition is : "+sum);        
        
    }

}
