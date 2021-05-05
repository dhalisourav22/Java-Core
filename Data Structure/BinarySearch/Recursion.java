package BinarySearch;

import static BinarySearch.Test.BinarySearch;
import java.util.Arrays;

public class Recursion {
    public static int BinarySearch(int[]Array, int Left, int Right, int Number){
        if(Left<=Right){
            int Mid = ((Left+Right)/2);
            if( Array[Mid] == Number )
                return 1;
            else if(Array[Mid] < Number)
                return BinarySearch(Array, Mid+1, Right, Number);
            else
                return BinarySearch(Array, Left, Mid-1, Number);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 36, 5, 4, 85, 52, 220, 20};
        Arrays.sort(arr);
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = input.nextInt(), r = (arr.length-1);
        int result = BinarySearch(arr,0,r,number);
        if(result == 1)
            System.out.println("We Find This Number");
        else
            System.out.println("We Don't Find This number");
    }
}
