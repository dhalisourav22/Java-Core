package CallByReference;

public class Test {
    public static void main(String[] args) {
        CallByRef a =new CallByRef();
        a.name = "Sourav";
        System.out.println("First :"+a.name);
        a.display(a);
        System.out.println("Second :"+a.name);
    }
}
