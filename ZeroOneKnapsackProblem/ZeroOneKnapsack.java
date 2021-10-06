//Dynamic Approach.
package ZeroOneKnapsackProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

public class ZeroOneKnapsack {

    String nameOfItem;
    double weightOfItem, valueOfItem;

    ZeroOneKnapsack(String nameOfItem, double weightOfItem, double valueOfItem) {
        this.nameOfItem = nameOfItem;
        this.weightOfItem = weightOfItem;
        this.valueOfItem = valueOfItem;
    }

    public static void main(String[] args) {
        try {
            
            try {  //Making File(For Taking Input).
                File textFileForInput = new File("D:/FileZeroOneKnapsack.txt");
                textFileForInput.createNewFile();
            } catch (IOException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Taking Input) Creating Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            try {  //Writing In File(For Taking Input)
                Formatter writeInTheFileFirstForInput = new Formatter("D:/FileZeroOneKnapsack.txt");
                writeInTheFileFirstForInput.format("4 5 1 2 3 2 3 4 3 4 5 4 5 6");
                writeInTheFileFirstForInput.close();
            } catch (FileNotFoundException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Taking Input) Writing Is Failed!");
                System.out.println("_______________________________________________________\n");
            }            

            File scanInput = new File("D:/FileZeroOneKnapsack.txt");
            Scanner input = new Scanner(scanInput);
            int totalNumberOfItem, maxWeightOfKnapsack;

            totalNumberOfItem = input.nextInt();  
            maxWeightOfKnapsack = input.nextInt();
            
            ZeroOneKnapsack[] k = new ZeroOneKnapsack[totalNumberOfItem];  //Array Of Object.
            String iName;
            double iWeight, iValue;

            for (int i = 0; i < totalNumberOfItem; i++) {  //Taking Input.
                iName = input.next();
                iWeight = input.nextDouble();
                iValue = input.nextDouble();
                
                k[i] = new ZeroOneKnapsack(iName, iWeight, iValue);
            }

            double[][] knapsackCell = new double[totalNumberOfItem + 1][maxWeightOfKnapsack + 1];  //For Cell(Here We Increce One Row And One Column For Zero).
            for (int row = 0; row <= totalNumberOfItem; row++) {
                knapsackCell[row][0] = 0;
            }
            for (int column = 0; column <= maxWeightOfKnapsack; column++) {
                knapsackCell[0][column] = 0;
            }

            for (int row = 1; row <= totalNumberOfItem; row++) {  //Main Work.(Geting Maximum Profit).
                for (int column = 0; column <= maxWeightOfKnapsack; column++) {

                    if (k[row - 1].weightOfItem <= column) {

                        if ((k[row - 1].valueOfItem + knapsackCell[row - 1][column - (int) k[row - 1].weightOfItem]) > knapsackCell[row - 1][column]) {
                            knapsackCell[row][column] = k[row - 1].valueOfItem + knapsackCell[row - 1][column - (int) k[row - 1].weightOfItem];
                        } else {    //(k[row-1].valueOfItem + knapsackCell[row-1][column-(int) k[row-1].weightOfItem]) <= knapsackCell[row-1][column])
                            knapsackCell[row][column] = knapsackCell[row - 1][column];
                        }

                    }
                    else {
                        knapsackCell[row][column] = knapsackCell[row - 1][column];
                    }
                }
            }

            //For File Output Or File Write(File Output Start).                
            try {  //Making Folder
                File folderForStoringFile = new File("D:/337_Sourav Dhali_6B");
                folderForStoringFile.mkdir();
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Folder(For Showing Output) Creating Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            try {  //Making File
                File textFileForResult = new File("D:/337_Sourav Dhali_6B/ResultOfZeroOneKnapsack.txt");
                textFileForResult.createNewFile();
            } catch (IOException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Showing Output) Creating Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            try {  //Writing In File
                Formatter writeInTheFile = new Formatter("D:/337_Sourav Dhali_6B/ResultOfZeroOneKnapsack.txt");

                writeInTheFile.format("_______________________________________________________\n\n");
                writeInTheFile.format("Solution : ");
                writeInTheFile.format("\n_______________________________________________________\n");
                writeInTheFile.format("\nThe Maximum Possible Value That Can Be Carried In The Knapsack : " + knapsackCell[totalNumberOfItem][maxWeightOfKnapsack] + " Unit.\n\n");

                writeInTheFile.format("The Solution Matrix is : \n");
                for (int row = 0; row <= totalNumberOfItem; row++) {   //Printing The Matrix.
                    for (int column = 0; column <= maxWeightOfKnapsack; column++) {
                        writeInTheFile.format("    " + knapsackCell[row][column]);
                    }
                    writeInTheFile.format("\n");
                }
                writeInTheFile.format("\n\n");

                ArrayList<String> pickingItemName = new ArrayList<>();

                while (totalNumberOfItem > 0 && maxWeightOfKnapsack > 0) {  //2nd Main Work(Finding The Taking Iteam Name).
                    if (knapsackCell[totalNumberOfItem][maxWeightOfKnapsack] != knapsackCell[totalNumberOfItem - 1][maxWeightOfKnapsack]) {
                        pickingItemName.add(k[totalNumberOfItem - 1].nameOfItem);   //Storing Name Into The ArrayList.
                        maxWeightOfKnapsack -= k[totalNumberOfItem - 1].weightOfItem;
                        totalNumberOfItem--;
                    } else {
                        totalNumberOfItem--;
                    }
                }
                Collections.reverse(pickingItemName);  //Help of collections class. We Reverse The ArrayList.

                writeInTheFile.format("Taken Item : ");
                for (String x : pickingItemName) {
                    writeInTheFile.format(x + ", ");
                }

                writeInTheFile.close();
            } catch (FileNotFoundException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Showing Output) Writing Is Failed!");
                System.out.println("_______________________________________________________\n");
            }
            //File Output End.    

        } catch (Exception e) {
            System.out.println("\n_______________________________________________________\n");
            System.out.println("Please Check The Entire Code And Try Again!");
            System.out.println("_______________________________________________________\n");
        }
    }
}
