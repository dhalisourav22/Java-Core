//Shortest Remaining Time First.
package ShortestJobFirst;

public class SRTF {

    String processName;
    int arrivelTime, burstTime, tempBurstTime;

    public SRTF(String processName, int arrivelTime, int burstTime, int tempBurstTime) {
        this.processName = processName;
        this.arrivelTime = arrivelTime;
        this.burstTime = burstTime;
        this.tempBurstTime = tempBurstTime;
    }

    public static void main(String[] args) {
        boolean isError = true;
        do {
            try {
                String pName;
                int aTime, bTime, numberOfProcess;
                java.util.Scanner input = new java.util.Scanner(System.in);

                System.out.print("Enter The Number Of Process : ");
                numberOfProcess = input.nextInt();

                SRTF[] p = new SRTF[numberOfProcess + 1];

                for (int i = 0; i < numberOfProcess; i++) {
                    System.out.print("\nEnter The " + (i + 1) + " Process Name : ");
                    pName = input.next();
                    System.out.print("Enter The " + (i + 1) + " Process Arrivel Time : ");
                    aTime = input.nextInt();
                    System.out.print("Enter The " + (i + 1) + " Process Burst Time : ");
                    bTime = input.nextInt();

                    p[i] = new SRTF(pName, aTime, bTime, bTime);
                }

                int indexOfSmallestBurstTimeProcess, numberOfProcessComplete = 0, endTimeOfCompletedProcess;

                int[] waitingTime = new int[numberOfProcess];
                int[] turnaroundTime = new int[numberOfProcess];
                p[numberOfProcess] = new SRTF("Smallest", 0, 999999, 999999);

                for (int time = 0; numberOfProcessComplete != numberOfProcess; time++) {
                    indexOfSmallestBurstTimeProcess = numberOfProcess;

                    for (int i = 0; i < numberOfProcess; i++) {
                        if (p[i].arrivelTime <= time && p[i].burstTime < p[indexOfSmallestBurstTimeProcess].burstTime && p[i].burstTime > 0) {
                            indexOfSmallestBurstTimeProcess = i;
                        }
                    }

                    p[indexOfSmallestBurstTimeProcess].burstTime--;

                    if (p[indexOfSmallestBurstTimeProcess].burstTime == 0) {
                        numberOfProcessComplete++;
                        endTimeOfCompletedProcess = time + 1;
                        waitingTime[indexOfSmallestBurstTimeProcess] = endTimeOfCompletedProcess - p[indexOfSmallestBurstTimeProcess].arrivelTime - p[indexOfSmallestBurstTimeProcess].tempBurstTime;
                        turnaroundTime[indexOfSmallestBurstTimeProcess] = endTimeOfCompletedProcess - p[indexOfSmallestBurstTimeProcess].arrivelTime;
                    }
                }

                System.out.println("\n_______________________________________________________\n");
                System.out.println("The Solution Of This Is : ");
                System.out.println("_______________________________________________________");
                double averageWaitingTime = 0, averageTurnaroundTime = 0;
                for (int i = 0; i < numberOfProcess; i++) {
                    averageWaitingTime += waitingTime[i];
                    averageTurnaroundTime += turnaroundTime[i];
                    System.out.println("\nPeocess Name : " + p[i].processName);
                    System.out.println("Waiting Time : " + waitingTime[i] + " Unit.");
                    System.out.println("Turnaroound Time : " + turnaroundTime[i] + " Unit.");
                }
                System.out.println("\n\nAverage Waiting Time : " + averageWaitingTime / numberOfProcess + " Unit.");
                System.out.println("Average Turnaround Time : " + averageTurnaroundTime / numberOfProcess + " Unit.\n");
                System.out.println("_______________________________________________________\n\n");

                isError = false;
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }
}
