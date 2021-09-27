//Dynamic Approach.
package ZeroOneKnapsackProblem;

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
                ZeroOneKnapsack[] k = new ZeroOneKnapsack[totalNumberOfItem];

                String iName;
                double iWeight, iValue;

                for (int i = 0; i < totalNumberOfItem; i++) {
                    System.out.print("\nEnter " + (i + 1) + " Item Name : ");
                    iName = input.next();
                    System.out.print("Enter " + (i + 1) + " Item Weight : ");
                    iWeight = input.nextDouble();
                    System.out.print("Enter " + (i + 1) + " Item Value : ");
                    iValue = input.nextDouble();
                    k[i] = new ZeroOneKnapsack(iName, iWeight, iValue);
                }

                double[][] knapsackCell = new double[totalNumberOfItem + 1][maxWeightOfKnapsack + 1];
                for (int row = 0; row <= totalNumberOfItem; row++) {
                    knapsackCell[row][0] = 0;
                }
                for (int column = 0; column <= maxWeightOfKnapsack; column++) {
                    knapsackCell[0][column] = 0;
                }

                for (int row = 1; row <= totalNumberOfItem; row++) {
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
                
                System.out.println("\n\n_______________________________________________________\n");
                System.out.println("Solution : ");
                System.out.println("_______________________________________________________\n");
                System.out.println("\nThe Maximum Possible Value That Can Be Carried In The Knapsack : " + knapsackCell[totalNumberOfItem][maxWeightOfKnapsack] + "\n\n");
                System.out.println("The Solution Matrix is : \n");
                for (int row = 0; row <= totalNumberOfItem; row++) {
                    for (int column = 0; column <= maxWeightOfKnapsack; column++) {
                        System.out.print("    " + knapsackCell[row][column]);
                    }
                    System.out.println("");
                }
                System.out.println("\n\n");

                isError = false;
            } catch (Exception e) {
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Please Enter A Valid Input. Try Again From Beganing!");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }
}
