package DiagonalUpperLowerTriangles;

import java.util.Scanner;

public class DiagonalUpperLowerTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Getting value :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Give the value of " + (row + 1) + " " + (col + 1) + " index : ");
                a[row][col] = input.nextInt();
            }

        }
        System.out.println("\nThe matrix is :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t" + a[row][col]);

            }
            System.out.println("");
        }
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sum += a[row][col];
                }
                if (row > col) {
                    sum2 += a[row][col];
                }
                if (row < col) {
                    sum1 += a[row][col];
                }

            }

        }
        System.out.println("\nThe sum of Diagonal is : " + sum);

        /*for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row < col) {
                    sum1 += a[row][col];
                }

            }

        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row > col) {
                    sum2 += a[row][col];
                }

            }

        }*/
        System.out.println("\nThe sum of Lower triangle is : " + sum2);
        System.out.println("\nThe sum of Upper triangle is : " + sum1);

    }
}
