package AddTwoMatrixs;

import java.util.*;

public class AddTwoMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int add[][] = new int[2][3];

        System.out.println("Getting value for first matrix : \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Give the " + row + " " + col + " index value :");
                a[row][col] = input.nextInt();

            }
        }

        System.out.println("\nGetting value for second matrix : \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Give the " + row + " " + col + " index value :");
                b[row][col] = input.nextInt();

            }
        }
        System.out.println("\n\nThe matrix 2*3 is :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + a[row][col]);

            }
            System.out.println("");
        }
        System.out.println("\n\nThe matrix 2*3 is :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + b[row][col]);

            }
            System.out.println("");
        }
        System.out.println("\n\nBy addaing first and second matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                add[row][col] = a[row][col] + b[row][col];
                System.out.print("\t" + add[row][col]);

            }
            System.out.println("");
        }

    }

}
