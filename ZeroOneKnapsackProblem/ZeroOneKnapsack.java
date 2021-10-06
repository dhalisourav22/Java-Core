//Dynamic Approach.
package ZeroOneKnapsackProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;

public class ZeroOneKnapsack {

    String nameOfItem;
    double weightOfItem, valueOfItem;

    ZeroOneKnapsack(String nameOfItem, double weightOfItem, double valueOfItem) {
        this.nameOfItem = nameOfItem;
        this.weightOfItem = weightOfItem;
        this.valueOfItem = valueOfItem;
    }

    public static void main(String[] args) {
        boolean isError = true;
        do {
            try {
                int totalNumberOfItem, maxWeightOfKnapsack;
                java.util.Scanner input = new java.util.Scanner(System.in);

                System.out.print("Enter The Total Number Of Item : ");
                totalNumberOfItem = input.nextInt();
                System.out.print("Enter The Maximum Capacity Of Knapsack : ");
                maxWeightOfKnapsack = input.nextInt();
                ZeroOneKnapsack[] k = new ZeroOneKnapsack[totalNumberOfItem];  //Array Of Object.

                String iName;
                double iWeight, iValue;

                for (int i = 0; i < totalNumberOfItem; i++) {  //Taking Input.
                    System.out.print("\nEnter " + (i + 1) + " Item Name : ");
                    iName = input.next();
                    System.out.print("Enter " + (i + 1) + " Item Weight : ");
                    iWeight = input.nextDouble();
                    System.out.print("Enter " + (i + 1) + " Item Value : ");
                    iValue = input.nextDouble();
                    k[i] = new ZeroOneKnapsack(iName, iWeight, iValue);
                }

                double[][] knapsackCell = new double[totalNumberOfItem + 1][maxWeightOfKnapsack + 1];  //For Cell.
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
                            } 
                            else {    //(k[row-1].valueOfItem + knapsackCell[row-1][column-(int) k[row-1].weightOfItem]) <= knapsackCell[row-1][column])
                                knapsackCell[row][column] = knapsackCell[row - 1][column];
                            }
                            
                        }
                        else {
                            knapsackCell[row][column] = knapsackCell[row - 1][column];
                        }
                    }
                }
                
                
                //For File Output Or File Write(File Output Start).                
                try{  //Making Folder
                    File folderForStoringFile = new File("D:/337_Sourav Dhali_6B");
                    folderForStoringFile.mkdir();
                }catch(Exception e){
                    System.out.println("\n_______________________________________________________\n");
                    System.out.println("The Folder Creating Is Failed!");
                    System.out.println("_______________________________________________________\n");
                }                
                
                try{  //Making File
                    File textFileForResult = new File("D:/337_Sourav Dhali_6B/ResultOfZeroOneKnapsack.txt");
                    textFileForResult.createNewFile();
                }catch(IOException e){
                    System.out.println("\n_______________________________________________________\n");
                    System.out.println("The Text File Creating Is Failed!");
                    System.out.println("_______________________________________________________\n");
                }
                
                try{  //Writing In File
                    Formatter writeInTheFile = new Formatter("D:/337_Sourav Dhali_6B/ResultOfZeroOneKnapsack.txt");
                    
                    writeInTheFile.format("_______________________________________________________\n\n");
                    writeInTheFile.format("Solution : ");
                    writeInTheFile.format("\n_______________________________________________________\n");
                    writeInTheFile.format("\nThe Maximum Possible Value That Can Be Carried In The Knapsack : "+ knapsackCell[totalNumberOfItem][maxWeightOfKnapsack] + " Unit.\n\n");
                    
                    writeInTheFile.format("The Solution Matrix is : \n");  
                    for (int row = 0; row <= totalNumberOfItem; row++) {   //Printing The Matrix.
                        for (int column = 0; column <= maxWeightOfKnapsack; column++) {
                            writeInTheFile.format("    " + knapsackCell[row][column]);
                        }
                        writeInTheFile.format("\n");
                    }
                    writeInTheFile.format("\n\n");
                    
                    
                    ArrayList<String> pickingItemName = new ArrayList<>();
                    
                    while(totalNumberOfItem>0 && maxWeightOfKnapsack>0){  //Finding The Taking Iteam Name.
                        if(knapsackCell[totalNumberOfItem][maxWeightOfKnapsack]!= knapsackCell[totalNumberOfItem-1][maxWeightOfKnapsack]){
                            pickingItemName.add(k[totalNumberOfItem-1].nameOfItem);                        
                            maxWeightOfKnapsack -=k[totalNumberOfItem-1].weightOfItem;
                            totalNumberOfItem--;
                        }else{
                            totalNumberOfItem--;
                        }  
                    }                
                    Collections.reverse(pickingItemName);  //Help of collections class. We Reverse The ArrayList.
                
                    writeInTheFile.format("Taken Item : ");
                    for(String x : pickingItemName){
                        writeInTheFile.format(x+", ");
                    }
                    
                    writeInTheFile.close();                    
                }catch(FileNotFoundException e){
                    System.out.println("\n_______________________________________________________\n");
                    System.out.println("The Text File Writing Is Failed!");
                    System.out.println("_______________________________________________________\n");
                } 
                //File Output End.    
                
                isError = false;
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }
}
