package TryCatch;

public class Test {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int result = x / y;
            System.out.println("Result is : " + result);
        } catch (ArrayIndexOutOfBoundsException e1) {

        } catch (Exception e2) {
            System.out.println("This is WRONG....!");
        } finally {
            int j = 2;
            System.out.println(""+x);
            System.out.println("This is the last line of the code.");
        }
    }
}
