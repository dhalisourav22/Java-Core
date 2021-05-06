package BuiltInQueueInJava;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<String>();
        name.add("Sourav");
        name.add("Sabuj");
        name.add("Sajib");
        System.out.println(name);
        name.poll();
        System.out.println(name);
        String brotherName = name.peek();
        System.out.println("Brother Is : "+brotherName);
        System.out.println(name.toArray()[1]);
        System.out.println("Size is : "+name.size());
        System.out.println("Contain : "+name.contains("Sabuj"));
    }
}
