package ReturningAValue;

public class Test {
    public static void main(String[] args) {
        ReturningValueDemo value = new ReturningValueDemo();
        int result = value.Sqr(5);
        System.out.println("Squear is : "+result);
        ReturningValueDemo value2 = new ReturningValueDemo();
        System.out.println("Squear is : "+value2.Sqr(25));
    }
}
