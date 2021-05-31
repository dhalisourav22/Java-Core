package BuiltInLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList();
        linky.add("Sourav");
        linky.add("Sabuj");
        linky.add("kakoli");
        linky.add(2,"Sweety");
        linky.addFirst("Tamim");;
        linky.addLast("Muzahid");
        System.out.println(linky.get(0));
        System.out.println("The list is : "+linky);
        System.out.println("Size is : "+linky.size());
        System.out.println("Is It Empty : "+linky.isEmpty());
        System.out.println("Geteing Elements : "+linky.get(0));
        linky.remove();
        //After removing.
        System.out.print("After Removing The List Is : [ ");
        for(String x : linky){
            System.out.print(x+", ");
        }
        System.out.println("\b\b ]");
        System.out.print("Enter Student Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        
        //Checking By Contain Methods.
        if(linky.contains("Sabuj") )
            System.out.println("Yes This list Contain That..!");
        else
            System.out.println("Sorry..! This List Dose Not Contain That.");
        
        System.out.print("Elements By Iterator : ");
        Iterator itr = linky.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ,");
        }
        System.out.println("Rrverse : ");
        System.out.println(linky.descendingIterator());
        
        
    }
}
