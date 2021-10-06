//Greedy Approach.
package FractionalKnapsackProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class FractionalKnapsack implements Comparable<FractionalKnapsack> {

    String nameOfItem;
    double weightOfItem, valueOfItem, fractionOfVByW;

    FractionalKnapsack(String nameOfItem, double weightOfItem, double valueOfItem, double fractionOfVByW) {
        this.nameOfItem = nameOfItem;
        this.weightOfItem = weightOfItem;
        this.valueOfItem = valueOfItem;
        this.fractionOfVByW = fractionOfVByW;
    }

    @Override
    public int compareTo(FractionalKnapsack t) {
        if (this.fractionOfVByW < t.fractionOfVByW) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        try {
            try {  //Making File(For Taking Input).
                File textFileForInput = new File("D:/FileFractionalKnapsack.txt");
                textFileForInput.createNewFile();
            } catch (IOException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Taking Input) Creating Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            try {  //Writing In File
                Formatter writeInTheFileFirstForInput = new Formatter("D:/FileFractionalKnapsack.txt");
                writeInTheFileFirstForInput.format("3 50 P1 10 60 P2 20 100 P3 30 120");
                writeInTheFileFirstForInput.close();
            } catch (FileNotFoundException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Taking Input) Writing Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            File scanInput = new File("D:/FileFractionalKnapsack.txt");
            Scanner input = new Scanner(scanInput);

            int numberOfItem = input.nextInt();
            double capacityOfKnapsack = input.nextDouble();

            FractionalKnapsack[] k = new FractionalKnapsack[numberOfItem];  //Array Of Object.
            String iName;
            double iWeight, iValue, fraction;

            for (int i = 0; i < numberOfItem; i++) {  //Loop For Taking Input.
                iName = input.next();
                iWeight = input.nextDouble();
                iValue = input.nextDouble();

                fraction = iValue / iWeight;           //Initialized Here Directly.         
                k[i] = new FractionalKnapsack(iName, iWeight, iValue, fraction);
            }
            Arrays.sort(k);

            String pickingItemName = " ";
            double getingValue = 0;

            
            for (int i = 0; i < numberOfItem; i++) {  //Here We Do The Main Work
                if (k[i].weightOfItem <= capacityOfKnapsack) {
                    pickingItemName += k[i].nameOfItem + ", ";
                    getingValue += k[i].valueOfItem;
                    capacityOfKnapsack -= k[i].weightOfItem;  //Decrease The Size Of Knapsack(By Taking Item Weight).
                } 
                else if ((k[i].weightOfItem / k[i].weightOfItem) <= capacityOfKnapsack) {
                    pickingItemName += k[i].nameOfItem + ".";    //Storing The Name Of Taking Item OutSide The Do While Loop. Because We Need This Name Once.              
                    do {
                        getingValue += k[i].valueOfItem / k[i].weightOfItem;
                        capacityOfKnapsack -= (k[i].weightOfItem / k[i].weightOfItem);       //Decrease The Size Of Knapsack(By Taking Item Per Unit).
                    } while ((k[i].weightOfItem / k[i].weightOfItem) <= capacityOfKnapsack);
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

            try {  //Making File(For Showing Output).
                File textFileForResult = new File("D:/337_Sourav Dhali_6B/ResultOfFractionalKnapsack.txt");
                textFileForResult.createNewFile();
            } catch (IOException e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Text File(For Showing Output) Creating Is Failed!");
                System.out.println("_______________________________________________________\n");
            }

            try {  //Writing In File(Output Or Answer).
                Formatter writeInTheFile = new Formatter("D:/337_Sourav Dhali_6B/ResultOfFractionalKnapsack.txt");

                writeInTheFile.format("_______________________________________________________\n\n");
                writeInTheFile.format("Solution : ");
                writeInTheFile.format("\n_______________________________________________________\n");
                writeInTheFile.format("\n\nName Of Item's Are : " + pickingItemName + "\n\nToal Profit Is     :  " + getingValue + " Unit.");

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
