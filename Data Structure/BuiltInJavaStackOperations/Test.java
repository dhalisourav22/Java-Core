package BuiltInJavaStackOperations;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> name = new Stack<String>();
        name.push("Sourav");
        name.push("Sabuj");
        name.add("Sajib");
        name.add("Abhijit");
        System.out.println("The name are : "+name);
        name.pop();
        System.out.println("The pop value is : "+name.pop());
        System.out.println("The peek value is : "+name.peek());
        name.push("kabita");
        name.push("Juthi");
        name.add("Supti");
        System.out.println("The names are : "+name);
        System.out.println("The size is : "+name.size());
        System.out.println("Is is Empty : "+name.isEmpty());
        System.out.println("The Index of value is : "+name.indexOf("kabita"));
        System.out.println("Is that contain Arpita ? \nAnswer is : "+name.contains("Arpita"));
        System.out.println("The value is in 3 Index : "+name.get(3));
        name.set(0,"Hridoy" );
        System.out.println("Stack is : "+name);
        
    }
}
