package ArrayAllFunction;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] number = {10,3,6,-3,25,-8,5};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" ");
            
        }
        System.out.println("");
        for (int i = number.length - 1; i >=0; i--) {
            System.out.print(number[i] +" ");
        }
        System.out.println("");
        String[] name= {"sourav","sabuj","sajib","abhijit"};
        Arrays.sort(name);
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+" ");
            
        }
    }
}
