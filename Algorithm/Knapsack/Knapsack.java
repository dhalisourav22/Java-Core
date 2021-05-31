package Knapsack;

public class Knapsack implements Comparable<Knapsack>{
    public double value, weight;
    String name;
    public Knapsack(double value , double weight, String name){
        this.value = value;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Knapsack t) {
        if((this.value/this.weight)<(t.value/t.weight)){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
