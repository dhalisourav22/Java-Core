package CallByValue;

public class Test {
    public static void main(String[] args) {
        CallByValue b = new CallByValue();
        int id = 10;
        System.out.println("Before : "+id);
        b.change(id );
        System.out.println("After : "+id);
        
    }
}
