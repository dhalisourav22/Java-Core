package FirstComeFirstServedScheduling;

import java.util.Scanner;

public class FIFO {
    
    String processName;
    int bustTime,waitingTime,turnaroundTime;
    
    FIFO(String processName, int bustTime){
        this.processName = processName;
        this.bustTime = bustTime;
    }
    
    public static void main(String[] args) {
        boolean isError = true;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Enter The Number Of Process : ");
                int numberOfProcess = input.nextInt();
                System.out.println("Please Enter With The Arrivel Order..!");
        
                FIFO[] p = new FIFO[numberOfProcess];
                String pName;
                int bTime;
        
                for (int i = 0; i < numberOfProcess; i++) {
                    System.out.print("\nEnter "+(i+1)+" Process Name : ");
                    pName = input.next();
                    System.out.print("Enter "+(i+1)+" Process Bust Time : ");
                    bTime = input.nextInt();
                    p[i] =new FIFO(pName,bTime);
                }
        
                int[] wTime = new int[numberOfProcess];
                int[] tTime = new int[numberOfProcess]; 
        
                wTime[0]=0;        
                for (int i = 1; i < numberOfProcess; i++) {            
                    wTime[i]= wTime[i-1] + p[i-1].bustTime;
                }
        
                tTime[0]=p[0].bustTime;
                for (int i = 1; i < numberOfProcess; i++) {            
                    tTime[i]=wTime[i]+p[i].bustTime;
                }
                
                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Solution Of This Is : ");
                System.out.println("_______________________________________________________\n");
                double averageWaitingTime = 0;
                for (int i = 0; i <numberOfProcess; i++) {
                    averageWaitingTime += wTime[i];
                    System.out.println("\nProcess Name : "+p[i].processName);
                    System.out.println("Process Waiting Time : "+wTime[i]+" Unit.");
                    System.out.println("Process Turnaround TIme : "+tTime[i]+" Unit.");
                }
                System.out.println("\n\nAverage Waiting Time : "+averageWaitingTime/numberOfProcess+" Unit.");
                isError = false;
            }catch(Exception e){
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }            
        }while(isError == true);   
    }
}