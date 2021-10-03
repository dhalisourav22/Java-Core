//Greedy Approach.
package FractionalKnapsackProblem;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack implements Comparable<FractionalKnapsack>{
    
    String nameOfItem;
    double weightOfItem,valueOfItem, fractionOfVByW;
    
    FractionalKnapsack(String nameOfItem,double weightOfItem,double valueOfItem,double fractionOfVByW){
        this.nameOfItem = nameOfItem;
        this.weightOfItem = weightOfItem;
        this.valueOfItem = valueOfItem;
        this.fractionOfVByW = fractionOfVByW;
    }
    
    @Override
    public int compareTo(FractionalKnapsack t) {
        if(this.fractionOfVByW<t.fractionOfVByW){
            return 1;
        }
        else{
            return -1;
        }
    }
        
    public static void main(String[] args) {
        
        boolean isError = true;
        do{
            try{                
                Scanner input = new Scanner(System.in);
                System.out.print("Enter The Number Of Item : ");
                int numberOfItem = input.nextInt();
                System.out.print("Enter The Total Capacity : ");
                double capacityOfKnapsack = input.nextDouble();
        
                System.out.println("Please Enter Details About Item..!"); 
                System.out.println("_______________________________________________________");
        
                FractionalKnapsack[] k = new FractionalKnapsack[numberOfItem];
                String iName;
                double iWeight,iValue, fraction;
        
                for (int i = 0; i < numberOfItem; i++) {
                    System.out.print("\nEnter "+(i+1)+" Item Name : ");
                    iName = input.next();
                    System.out.print("Enter "+(i+1)+" Item Weight : ");
                    iWeight = input.nextDouble();
                    System.out.print("Enter "+(i+1)+" Item Value : ");
                    iValue = input.nextDouble();
                    
                    fraction = iValue/iWeight;                    
                    k[i] = new FractionalKnapsack(iName,iWeight,iValue,fraction);
                } 
                
                Arrays.sort(k);  
        
                String pickingItemName =" ";
                double getingValue = 0;
        
                for (int i = 0; i < numberOfItem; i++) {
                    
                    if(k[i].weightOfItem <= capacityOfKnapsack){
                        pickingItemName += k[i].nameOfItem+","; 
                        getingValue += k[i].valueOfItem;
                        capacityOfKnapsack -= k[i].weightOfItem;
                    }                    
                    else if((k[i].weightOfItem/k[i].weightOfItem)<= capacityOfKnapsack){
                        pickingItemName += k[i].nameOfItem+",";                        
                        do{
                            getingValue += k[i].valueOfItem/k[i].weightOfItem;
                            capacityOfKnapsack -= (k[i].weightOfItem/k[i].weightOfItem);                    
                        }
                        while((k[i].weightOfItem/k[i].weightOfItem)<= capacityOfKnapsack);
                    }                    
                }       
                
                System.out.println("\n\n_______________________________________________________\n");
                System.out.println("Solution : ");
                System.out.println("_______________________________________________________\n");
                System.out.println("\nName Of Item's Are : "+pickingItemName+"\b.\nToal Profit Is : "+getingValue+".\n\n\n");
            
                isError = false;
            }
            catch(Exception e){
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        }while(isError == true);          
    }
}
