package StaticMethod2;

public class StaticDemo {
    static int i = 10;
    static void display1(){
        System.out.println("Static first");
    }
    static void display2(){
        System.out.println("Static second");
        System.out.println(i +"");
        display1();
    }
}
