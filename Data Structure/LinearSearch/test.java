package LinearSearch;
import java.util.Scanner;

public class test {
    public static void LinearSearch(int[] array, int number){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if(number == array[i] ){
                temp = 0;
                break;
            }
            else
                temp++;               
        }
        if(temp==0)
            System.out.println("The number in the list.");
        else
            System.out.println("The number not in the list.");
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,5,50,60};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        test.LinearSearch(arr, num);
    }
}
