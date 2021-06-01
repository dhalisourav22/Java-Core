package MaltiplicationTwoMatrices;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] arr_1 = new int[3][3];
        int[][] arr_2 = new int[3][3];
        int[][] arr_ans = new int[3][3];
        System.out.println("Give input for first Matrices :");
        for (int row = 0; row < arr_1.length; row++) {
            for (int col = 0; col < arr_1.length; col++) {
                System.out.print("Input for ["+(row+1)+"] ["+(col+1)+"] index : ");
                arr_1[row][col] = input.nextInt();
            }            
        }
        System.out.println("\nGive input for second Matrix :");
        for (int row = 0; row < arr_2.length; row++) {
            for (int col = 0; col < arr_2.length; col++) {
                System.out.print("Input for ["+(row+1)+"] ["+(col+1)+"] index : ");
                arr_2[row][col] = input.nextInt();
            }            
        }
        System.out.println("\n\nMaltiplication of two Matrices is : ");
        for (int i = 0; i <arr_2.length; i++) {
            for (int j = 0; j <arr_1.length; j++) {
                int temp =0;
                for (int k = 0; k < arr_1.length; k++) {
                    temp = temp + arr_1[i][k] * arr_2[k][j];                    
                }
                arr_ans[i][j] = temp;
            }        
        }
        for (int row = 0; row <arr_ans.length; row++) {
            for (int col = 0; col <arr_ans.length; col++) {
                System.out.print("\t"+arr_ans[row][col]);
                
            }
            System.out.println("");
        }       
        
    }
    
}
