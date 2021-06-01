package ArrayAllFunction;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number;  //declaretion
        number = new int[10];  //creation
        int[] mark = new int[5];  //declaration and creation in one line
        String[] names;

        number[0] = 11;  //intialization
        number[1] = 12;
        number[2] = 13;
        number[3] = 14;
        number[4] = 15;

        System.out.println("Size is : " + mark.length); //size of a array

        int sum = 0;
        for (int i = 0; i < mark.length; i++) {    //intializ by loop
            System.out.print("Enter number " + (i + 1) + " value : ");
            mark[i] = input.nextInt();
            sum += mark[i];    //adition by loop
        }
        System.out.println("Total number is : " + sum);
        System.out.println("The Average is : " + (sum / mark.length));
        
        int max ,min;
        max=min=mark[0];
        for (int i = 0; i < mark.length; i++) {
            if(max<mark[i]){
                max= mark[i];
            }            
            if(min>mark[i]){
                min= mark[i];
            }            
        }
        System.out.println("Maximum value is :"+max);
        System.out.println("Minimum value is :"+min);
    }

}
