package FirstComeFirstServedScheduling;

import java.util.Arrays;
import java.util.Scanner;

public class FIFOWithArrivelTime implements Comparable<FIFOWithArrivelTime> {
    
    String processName;
    int bustTime,arrivelTime,waitingTime,turnaroundTime;
    
    FIFOWithArrivelTime(String processName, int bustTime,int arrivelTime){
        this.processName = processName;
        this.bustTime = bustTime;
        this.arrivelTime = arrivelTime;
    }
    
    @Override
    public int compareTo(FIFOWithArrivelTime t) {
        if(this.arrivelTime>t.arrivelTime){
            return 1;
        }else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        boolean isError = true;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Enter The Number Of Process : ");
                int numberOfProcess = input.nextInt();
                System.out.println("Please Enter With The Arrivel Order..!");
        
                FIFOWithArrivelTime[] p = new FIFOWithArrivelTime[numberOfProcess];
                String pName;
                int bTime,aTime;
        
                for (int i = 0; i < numberOfProcess; i++) {
                    System.out.print("\nEnter "+(i+1)+" Process Name : ");
                    pName = input.next();
                    System.out.print("Enter "+(i+1)+" Process Bust Time : ");
                    bTime = input.nextInt();
                    System.out.print("Enter "+(i+1)+" Process Arrivel Time : ");
                    aTime = input.nextInt();
                    p[i] =new FIFOWithArrivelTime(pName,bTime,aTime);
                }
                Arrays.sort(p);
                
                int[] wTime = new int[numberOfProcess];  //Waiting Time.
                int[] sTime = new int[numberOfProcess];  //Service Time.
                int[] tTime = new int[numberOfProcess];  //Turnaround Time.
        
                sTime[0]=0;
                for (int i = 1; i < numberOfProcess; i++) {
                    sTime[i]= sTime[i-1]+p[i-1].bustTime;
                }
                
                wTime[0]=0;                
                for (int i = 1; i < numberOfProcess; i++) {   
                    wTime[i]= sTime[i]-p[i].arrivelTime;
                }
        
                tTime[0]=p[0].bustTime;
                for (int i = 1; i < numberOfProcess; i++) {            
                    tTime[i]= wTime[i]+p[i].bustTime;
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
            }
            catch(Exception e){
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }            
        }while(isError == true);   
    }    
}
