package StringFunction;

public class String1 {
    public static void main(String[] args) {
        String password1 = "sourav123";
        String password2 = "sourav123";
        String password3 = new String("sourav123");
        String password4 = new String("sourav123");
        System.out.println("equals() mathod check : ");
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        System.out.println("\n== operetor check : ");
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);
    }
}
