package TrapezoidalRule;
import java.text.DecimalFormat;

public class Trapezoidal {
    public static void main(String[] args) {
        boolean isError = true;
        do {
            try {
                DecimalFormat df3 = new DecimalFormat("0.000");
                int lowerLimit = 1, higherLimit = 2;
                System.out.print("Enter The Value Of N : ");
                java.util.Scanner input = new java.util.Scanner(System.in);
                double n = input.nextDouble();
                double dellx = (higherLimit - lowerLimit) / n;
                double sumOfFxi = 0, answer;
                for (int i = 0; i <= n; i++) {
                    double xi = (lowerLimit + (i * dellx));
                    if (i == 0 || i == n) {
                        sumOfFxi += f(xi);
                    } else {
                        sumOfFxi += (2 * f(xi));
                    }
                }
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Solution : ");
                System.out.println("_______________________________________________________\n");
                answer = (dellx / 2) * sumOfFxi;
                System.out.println("The Answer Of Integration Is : " + df3.format(answer));
                isError = false;
            } catch (Exception e) {
                System.out.println("_______________________________________________________\n");
                System.out.println("Please Enter Valid Input type(Integer) Of N. Try Again!  ");
                System.out.println("_______________________________________________________\n");
            }
        } while (isError == true);
    }
    public static double f(double x) {
        return 1 / x;
    }
}