package Kmeansalgo;
import java.util.Random;
import java.util.Scanner;

public class kmeans {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Taking input(How many dataset in the question)
        System.out.print("How many data point you want to enter: ");
        int numberOfDataPoint = input.nextInt();
        
        //Making array of dataset name point x and point y; (0 to numberOfDataPoint-1) is the range;
        String[] nameOfDataset = new String[numberOfDataPoint];
        double[] pointXOfDataSet = new double[numberOfDataPoint];
        double[] pointYOfDataSet = new double[numberOfDataPoint];
        
        //Taking Input.
        for (int takeInputOfNameAndPointXAndPointY = 0; takeInputOfNameAndPointXAndPointY < numberOfDataPoint; takeInputOfNameAndPointXAndPointY++) {
            
            System.out.println("\nFor The No "+(takeInputOfNameAndPointXAndPointY+1)+" Data:");
            System.out.print("\tEnter The Name : ");
            nameOfDataset[takeInputOfNameAndPointXAndPointY] = input.next();
            System.out.print("\tEnter The Value Of X : ");
            pointXOfDataSet[takeInputOfNameAndPointXAndPointY] = input.nextDouble();
            System.out.print("\tEnter The Value Of Y : ");
            pointYOfDataSet[takeInputOfNameAndPointXAndPointY] = input.nextDouble();
            
        }
        
        //Taking The Number Of k means how many cluster user want.
        System.out.print("\n\nHow Many Cluster You wanna Create : ");
        int numberOfCluster = input.nextInt();
        
        //Choosing Centroid;
        double[] centroidX = new double[numberOfCluster];
        double[] centroidY = new double[numberOfCluster];
        
        //Taking Input(Centroid)
        for (int takeInputCentroid = 0; takeInputCentroid < numberOfCluster; takeInputCentroid++) {
            
            System.out.println("\nFor The Centroid No "+(takeInputCentroid+1)+" :");
            System.out.print("\tEnter The X : ");
            centroidX[takeInputCentroid] = input.nextDouble();
            System.out.print("\tEnter The Y : ");
            centroidY[takeInputCentroid] = input.nextDouble();
            
        }
        
        //How many Time we want iterate at least;
        System.out.print("\n\nEnter The Higest Number Of Iteration: ");
        int numberOfIteration = input.nextInt();
        
        
        
        //Distance Storing
        double[][] distance = new double[numberOfCluster][numberOfDataPoint];
        //Where the data poing go.
        String[] whereGoing = new String[numberOfDataPoint];        
        //For getting new centroid
        double[] totalValueOfX = new double[numberOfCluster];
        double[] totalValueOfY = new double[numberOfCluster];

        
        
        //Iteration
        for (int i = 0; i < numberOfIteration; i++) {
            
            
            //Calculating Distance from centroid.
            for (int row = 0; row < numberOfCluster; row++) {
                for (int col = 0; col < numberOfDataPoint; col++) {

                    double x1 = pointXOfDataSet[col];
                    double y1 = pointYOfDataSet[col];

                    double x2 = centroidX[row];
                    double y2 = centroidY[row];

                    double diffX = Math.abs(x2-x1);
                    double diffY = Math.abs(y2-y1);

                    distance[row][col] = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
                }
            }

            

            
            //NotDinamic
            int countHowManyGoToK1 = 0;
            int countHowManyGoToK2 = 0;
            //intialize the sum var as 0
            totalValueOfX[0]=0;
            totalValueOfY[0]=0;
            totalValueOfX[1]=0;
            totalValueOfY[1]=0;

            //Grouping
            for (int col = 0; col < numberOfDataPoint; col++) {

                try{
                    if(numberOfCluster == 2){  //Not dinamic
                        for (int row = 0; row <=0; row++) {
                            if(distance[row][col]< distance[row+1][col]){
                                whereGoing[col]="K1";

                                totalValueOfX[0] = totalValueOfX[0]+pointXOfDataSet[col];
                                totalValueOfY[0] = totalValueOfY[0]+pointYOfDataSet[col];
                                countHowManyGoToK1++;

                            }
                            else{
                                whereGoing[col]="K2";
                                
                                totalValueOfX[1] = totalValueOfX[1]+pointXOfDataSet[col];
                                totalValueOfY[1] = totalValueOfY[1]+pointYOfDataSet[col];
                                countHowManyGoToK2++;
                            }
                        }
                    }
                }catch(Exception e){
                    System.out.println("We are not able to design for three or more cluster now!");
                }

            }
            double tempCentroidXForCluster1 = centroidX[0];
            double tempCentroidYForCluster1 = centroidY[0];
            
            double tempCentroidXForCluster2 = centroidX[1];
            double tempCentroidYForCluster2 = centroidY[1];

            //New Centroid Point (Not Dinamic);
            centroidX[0] = totalValueOfX[0]/countHowManyGoToK1; 
            centroidY[0] = totalValueOfY[0]/countHowManyGoToK1; 

            centroidX[1] = totalValueOfX[1]/countHowManyGoToK2; 
            centroidY[1] = totalValueOfY[1]/countHowManyGoToK2;
            
            
            
            
            if(tempCentroidXForCluster1 == centroidX[0] && tempCentroidYForCluster1 == centroidY[0] && tempCentroidXForCluster2 == centroidX[1] && tempCentroidYForCluster2 == centroidY[1]){
                  break;
            }
            
            //Table
            for (int row = 0; row < numberOfCluster; row++) {
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                for (int col = 0; col < numberOfDataPoint; col++) {
                    System.out.printf("\t%.2f",distance[row][col]);
                }
                System.out.println("");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
            }
            
            
            //Print 
            System.out.println("\nThe New Centroid For K1");
            System.out.println("\tx: "+centroidX[0]);
            System.out.println("\ty: "+centroidY[0]);
            System.out.println("The New Centroid For For K2");
            System.out.println("\tx: "+centroidX[1]);
            System.out.println("\ty: "+centroidY[1]);
        }
        
        System.out.println("\nSo the data set are going to : ");
        for (int i = 0; i < numberOfDataPoint; i++) {
            System.out.println("\t"+nameOfDataset[i]+" is go to the : "+whereGoing[i]);
        }
        
        
        //New centroid;
        
        
        
//        for (int row = 0; row < numberOfCluster; row++) {
//            for (int col = 0; col < numberOfDataPoint; col++) {
//                System.out.print("\t"+distance[row][col]);
//            }
//            System.out.println("");
//        }
        
    }
}
