package PriorityScheduling;

import java.util.Arrays;
import java.util.Scanner;

public class PriorityNonPreemptive implements Comparable<PriorityNonPreemptive> {

    String processName;
    int burstTime, priorityNumber;

    public PriorityNonPreemptive(String processName, int burstTime, int priorityNumber) {
        this.processName = processName;
        this.burstTime = burstTime;
        this.priorityNumber = priorityNumber;
    }

    public static void main(String[] args) {
        boolean isError = true;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter The Number Of Process : ");
                int numberOfProcess = input.nextInt();

                PriorityNonPreemptive[] p = new PriorityNonPreemptive[numberOfProcess];
                String pName;
                int bTime, pNumber;

                for (int i = 0; i < numberOfProcess; i++) {
                    System.out.print("\nEnter " + (i + 1) + " Process Name : ");
                    pName = input.next();
                    System.out.print("Enter " + (i + 1) + " Process Bust Time : ");
                    bTime = input.nextInt();
                    System.out.print("Enter " + (i + 1) + " Process Priority : ");
                    pNumber = input.nextInt();
                    p[i] = new PriorityNonPreemptive(pName, bTime, pNumber);
                }

                Arrays.sort(p);

                int[] waitingTime = new int[numberOfProcess];
                int[] turnaroundTime = new int[numberOfProcess];

                waitingTime[0] = 0;
                for (int i = 1; i < numberOfProcess; i++) {
                    waitingTime[i] = waitingTime[i - 1] + p[i - 1].burstTime;
                }

                for (int i = 0; i < numberOfProcess; i++) {
                    turnaroundTime[i] = waitingTime[i] + p[i].burstTime;
                }

                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Solution Of This Is : ");
                System.out.println("_______________________________________________________\n");
                double averageWaitingTime = 0;
                for (int i = 0; i < numberOfProcess; i++) {
                    averageWaitingTime += waitingTime[i];
                    System.out.println("\nProcess Name : " + p[i].processName);
                    System.out.println("Process Waiting Time : " + waitingTime[i] + " Unit.");
                    System.out.println("Process Turnaround TIme : " + turnaroundTime[i] + " Unit.");
                }
                System.out.println("\n\nAverage Waiting Time : " + averageWaitingTime / numberOfProcess + " Unit.\n\n");

                isError = false;
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }

    @Override
    public int compareTo(PriorityNonPreemptive t) {
        if (this.priorityNumber > t.priorityNumber) {
            return 1;
        } else {
            return -1;
        }
    }
}
