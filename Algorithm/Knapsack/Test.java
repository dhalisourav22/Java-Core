package Knapsack;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, knapsackSize;
        double value, weight, profit = 0;
        String name,items = "";
        System.out.println("Welcome to Fractional Knapsack problem---------\n");
        System.out.print("Enter Your Knapsack Total Weight : ");
        knapsackSize = input.nextInt();
        System.out.print("Enter the Total amount of item : ");
        n = input.nextInt();                
        
        Knapsack[] item = new Knapsack[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The Name Of "+(i+1)+" item : ");
            name = input.next();
            System.out.print("Enter The Value Of "+(i+1)+" item : ");
            value = input.nextDouble();
            System.out.print("Enter The Weight Of "+(i+1)+" item : ");
            weight = input.nextDouble();
            item[i] = new Knapsack(value,weight,name);
        }
        Arrays.sort(item);

        for (int j = 0; j < n; j++) {
            if (item[j].weight <= knapsackSize){
                items += item[j].name+", ";
                profit += ((item[j].value / item[j].weight)* item[j].weight);
                knapsackSize -= item[j].weight;
            } 
            else if(( item[j].weight / item[j].weight) <= knapsackSize) {
                items += item[j].name+".";
                do {
                    profit += ((item[j].value / item[j].weight) * (item[j].weight / item[j].weight));
                    knapsackSize -= ( item[j].weight / item[j].weight);
                }
                while((item[j].weight/item[j].weight)<= knapsackSize);
                /*
                while(( item[j].weight / item[j].weight) <= knapsackSize){
                    profit += (item[j].value * (item[j].weight / item[j].weight));
                    knapsackSize -= ( item[j].weight / item[j].weight);
                }
                */
            }
        }
        
        System.out.println("\n\nThe answer is :");
        System.out.println("Total Profit is : "+profit);
        System.out.println("Items are : "+items);
        /*for(Knapsack x : item){
            System.out.println("Name : "+x.name);
            System.out.println("Per Unit Value : "+(x.value/x.weight));
            System.out.println("Weight "+x.weight);
        }*/
    }
}
