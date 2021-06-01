package SecondHighestNumber;
import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] number = {10, 20, 30,5,9,2,6};
        Arrays.sort(number);
        System.out.println("second highest number is:  "+number[number.length - 3]);
        int i = -13;
        int j = -2;
        int k = i%j;
        System.out.println("k = "+k);
    }
}
