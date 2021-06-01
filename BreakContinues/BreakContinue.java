package BreakContinues;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 1; i<= 20; i++){
            if(i==12){
                break;
            }
            System.out.println("Value is : "+i);
        }
        System.out.println("\n\n");
        for(int i = 1; i<= 20; i++){
            if(i==12){
                continue;
            }
            System.out.println("Value is : "+i);
        }
    }
}
