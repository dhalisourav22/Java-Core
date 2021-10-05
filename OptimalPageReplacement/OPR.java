package OptimalPageReplacement;

public class OPR {

    public static void main(String[] args) {
        boolean isError = true;
        do {
            try {
                int numberOfFrame, numberOfPage, flag1, flag2, flag3, positionOfFrameWhereWeReplaceNewFrame = 0, hit, fault = 0;
                java.util.Scanner input = new java.util.Scanner(System.in);

                System.out.print("Enter The Number Of Frame : ");
                numberOfFrame = input.nextInt();
                System.out.print("Enter The Number Of Page : ");
                numberOfPage = input.nextInt();

                int[] frames = new int[numberOfFrame];
                int[] tempFrames = new int[numberOfFrame];
                int[] pages = new int[numberOfPage];

                System.out.println("\nEnter The Reference String(One By One) : ");
                for (int i = 0; i < numberOfPage; i++) {
                    System.out.print("\tEnter " + (i + 1) + " Number String : ");
                    pages[i] = input.nextInt();
                }
                for (int i = 0; i < numberOfFrame; i++) {
                    frames[i] = -1;
                }

                System.out.println("\nThe Solution Look's Like : ");
                for (int i = 0; i < numberOfPage; i++) {
                    flag1 = flag2 = 0;
                    for (int j = 0; j < numberOfFrame; j++) {
                        if (frames[j] == pages[i]) {
                            flag1 = flag2 = 1;
                            break;
                        }
                    }                    
                    if (flag1 == 0) {
                        for (int j = 0; j < numberOfFrame; j++) {
                            if (frames[j] == -1) {
                                frames[j] = pages[i];
                                flag2 = 1;
                                fault++;
                                break;
                            }
                        }
                    }
                    
                    if (flag2 == 0) {
                        flag3 = 0;
                        for (int j = 0; j < numberOfFrame; j++) {
                            tempFrames[j] = -1;
                            for (int k = i + 1; k < numberOfPage; k++) {
                                if (frames[j] == pages[k]) {
                                    tempFrames[j] = k;
                                    break;
                                }
                            }
                        }
                        for (int j = 0; j < numberOfFrame; j++) {
                            if (tempFrames[j] == -1) {
                                positionOfFrameWhereWeReplaceNewFrame = j;
                                flag3 = 1;
                                break;
                            }
                        }
                        if (flag3 == 0) {
                            int maximumPosition = tempFrames[0];
                            positionOfFrameWhereWeReplaceNewFrame = 0;

                            for (int j = 1; j < numberOfFrame; j++) {
                                if (tempFrames[j] > maximumPosition) {
                                    maximumPosition = tempFrames[j];
                                    positionOfFrameWhereWeReplaceNewFrame = j;
                                }
                            }
                        }
                        frames[positionOfFrameWhereWeReplaceNewFrame] = pages[i];
                        fault++;
                    }

                    System.out.print("\t(" + pages[i] + ") :: ");
                    for (int j = 0; j < numberOfFrame; j++) {
                        System.out.printf("  " + frames[j] + "\t");
                    }
                    System.out.println();
                }
                
                System.out.println("\nThe Amount Of Page HIT : " + (numberOfPage - fault) + " Time.");
                double hitRatio = ((double) (numberOfPage - fault) / (double) numberOfPage) * 100;
                System.out.println("The Ration Of Page HIT   : " + hitRatio + "%");
                System.out.println("\nThe Amount Of Page FAULT : " + fault + " Time.");
                double falutRatio = ((double) fault / (double) numberOfPage) * 100;
                System.out.println("The Ration Of Page Fault   : " + falutRatio + "%");
                
                isError = false;
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input(Integer Type). Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }
}