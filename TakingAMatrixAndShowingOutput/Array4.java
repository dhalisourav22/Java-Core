package TakingAMatrixAndShowingOutput;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] number;
        number = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Give the " + row + " " + col + " index value :");
                number[row][col] = input.nextInt();

            }
        }
        System.out.println("\n\nThe matrix 2*3 is :\n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+number [row][col]);

            }
            System.out.println("");
        }

    }

}
