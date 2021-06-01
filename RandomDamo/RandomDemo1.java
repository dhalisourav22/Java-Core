package RandomDamo;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(100)+1;
        System.out.println("randNumber is : "+randNum );
        
        int randNum1 = (int) (Math.random()*10) +1 ;   //1 to 10;
        int randNum2 = (int) (Math.random()*10) ;   //0 to 10;
        System.out.println("Math class random : "+randNum1);
        System.out.println("Math class random : "+randNum2);
    }
}
