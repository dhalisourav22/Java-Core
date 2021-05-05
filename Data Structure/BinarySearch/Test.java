package BinarySearch;
import java.util.Arrays;
public class Test {
    public static int BinarySearch(int[] Array, int Number){
        int Left = 0;
        int Right = (Array.length-1);
        while(Left<=Right){
            int Mid = ((Left+Right)/2);
            if( Array[Mid] == Number )
                return 1;
            else if(Array[Mid]<Number)
                Left = Mid+1;
            else
                Right = Mid-1;            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 36, 5, 4, 85, 52, 220, 20};
        Arrays.sort(arr);
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = input.nextInt();
        int result = BinarySearch(arr, number);
        if(result == 1)
            System.out.println("We Find This Number");
        else
            System.out.println("We Don't Find This number");
    }
}
