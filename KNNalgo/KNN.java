package KNNalgo;

import java.util.Arrays;
import java.util.Scanner;

public class KNN implements Comparable<KNN>{

    double parameter1, parameter2, distance;
    String label;

    public KNN(double parameter1, double parameter2, String label, double distance) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.label = label;
        this.distance = distance;

    }
    
    @Override
    public int compareTo(KNN t) {
        if(this.distance>t.distance){
            return 1;
        }else{
            return -1;
        }
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----- KNN Algo With Two Attribute Data Point -----\n\n");        
        
        
        //Input test data.
        System.out.println("Enter The Test Dataset : ");
        System.out.print("\tEnter Parameter 1 Value: ");
        double testDataParameter1 = input.nextDouble();
        System.out.print("\tEnter Parameter 2 Value: ");
        double testDataParameter2 = input.nextDouble();
        
        
        //Input train data
        System.out.println("\nTrain The Machine: ");
        System.out.print("Enter The Number Of Train Data You Have: ");
        int numberOfTrainData = input.nextInt();
        
        KNN[] arrayOfOb = new KNN[numberOfTrainData];
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < numberOfTrainData; i++) {
            System.out.println("\tEnter Data Point for No "+(i+1)+": ");
            System.out.print("\t\tEnter Parameter 1 Value: ");
            double trainDataParameter1 = input.nextDouble();
            System.out.print("\t\tEnter Parameter 2 Value: ");
            double trainDataParameter2 = input.nextDouble();
            System.out.print("\t\tEnter Lable Value: ");
            String trainDataLabel = input.next();
            
            //Distance calculation;
            double diffParameter1 = Math.abs(trainDataParameter1-testDataParameter1);
            double diffParameter2 = Math.abs(trainDataParameter2-testDataParameter2);
            double distance = Math.sqrt(Math.pow(diffParameter1, 2) + Math.pow(diffParameter2, 2));
            
            //Initialization objects by constructor.
            arrayOfOb[i] = new KNN(trainDataParameter1, trainDataParameter2, trainDataLabel, distance);
        }
        //Sort the array based on distance.
        Arrays.sort(arrayOfOb);
        System.out.println("-----------------------------------------------------------------------\n");
        
        System.out.print("How Many Neighbour You Want: ");
        int numberOfDataSetWantToCheck = input.nextInt();
        
        //Printing Table(That much we want).
        System.out.println("\nThe Table: ");
        System.out.println(".......................................................................\n");
        System.out.println("Sl No\tAttribute1\tAttribute2\tlabel\tDistance");
        System.out.println("-----------------------------------------------------------------------\n");
        for (int i = 0; i < numberOfDataSetWantToCheck; i++) {
            System.out.print(i+1);
            System.out.print("\t  "+arrayOfOb[i].parameter1);
            System.out.print("\t\t "+arrayOfOb[i].parameter2);
            System.out.print("\t\t"+arrayOfOb[i].label);
            System.out.printf("\t %.2f",arrayOfOb[i].distance);
            System.out.println("\n-----------------------------------------------------------------------");
        }
        System.out.println(".......................................................................\n");
        
        
        //For two types of label
        String firstTypeOfLabel = arrayOfOb[0].label;
        String secondTypeOfLabel = null;
        int countFirstTypeOfLabel = 0;
        int countSecondTypeOfLabel = 0;
        
        for (int i = 0; i < numberOfDataSetWantToCheck; i++) {
            if(firstTypeOfLabel == arrayOfOb[i].label){
                countSecondTypeOfLabel++;
            }
            else{
                secondTypeOfLabel = arrayOfOb[i].label;
                countFirstTypeOfLabel++;
            }
        }
        
        String resultOfLabel;
        if(countFirstTypeOfLabel>=countSecondTypeOfLabel){
            resultOfLabel = firstTypeOfLabel;
        }else{
            resultOfLabel = secondTypeOfLabel;
        }
        System.out.println("First Type of label is : "+firstTypeOfLabel);
        System.out.println("Second Type of label is : "+secondTypeOfLabel);
        System.out.println("First Type Of Label appearde : "+countFirstTypeOfLabel);
        System.out.println("Second Type Of Label appearde : "+countSecondTypeOfLabel);
               
        System.out.println("\nHere,\n\tWe can see the desirable label for our input is : "+resultOfLabel);
        
    }
    
    

    

}
