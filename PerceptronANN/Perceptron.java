package PerceptronANN;
import java.util.Scanner;

public class Perceptron {
    double input, weight;

    public Perceptron(double input, double weight) {  //Constructor;
        this.input = input;
        this.weight = weight;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\tPerceptron\n\n");
        System.out.print("How Many Input You Have: ");
        int numberOfInput = input.nextInt();
        
        Perceptron[] items = new Perceptron[numberOfInput];  //Array of object;
        
        for (int i = 0; i < numberOfInput; i++) {   //Taking inpus;
            System.out.println("\tEnter Values For Number "+(i+1)+" Imput: ");
            
            System.out.print("\t\tEnter The X"+(i+1)+" Value: ");
            double inputs = input.nextDouble();            
            System.out.print("\t\tEnter The W"+(i+1)+" Value: ");
            double weights = input.nextDouble();
            
            items[i] = new Perceptron(inputs, weights);  //Send value in constructor;
        } 
        
        System.out.print("\n\tEnter The Bias Value For Neuron: ");  //Taking Bias value;
        double bias = input.nextDouble();
        
        double z = 0;
        for (int i = 0; i < numberOfInput; i++) {   //Weighted sum calculation;
            z += items[i].input*items[i].weight;
        }        
        z += bias; //Adding bias also;
        
        double a = 1/(1+Math.exp(-z));  //Main Calculation;
        
        System.out.printf("\n\nThe Single Value Is : %.3f\n\n",a);
    }
}
