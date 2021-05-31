package MethodOverloading;

public class MethodDemo {
    void add( int a ,int b){
        System.out.println(a+b);
    }
    void add( int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add (double a, double b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("Nothing");
    }
}
