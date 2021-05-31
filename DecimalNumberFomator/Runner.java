package DecimalNumberFomator;

import java.text.DecimalFormat;

public class Runner {
    public static void main(String[] args) {
        double x=2.896361;
        System.out.printf("Number is  : %.2f ",x);
        double y =3.26469;
        DecimalFormat DF2 = new DecimalFormat("0.00");
        DecimalFormat DF3 = new DecimalFormat("0.000");
        System.out.println("2 value is : "+DF2.format(y));
        System.out.println("3 value is : "+DF3.format(y));
    }
}
