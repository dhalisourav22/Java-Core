package RegularFalsiMethod;
public class Falsi {
    public static void main(String[] args) {
        double a = 0, b = 1, cPresent = 0, trueError = 0.001, cPrev, error = a-b;
        int iterationNumber = 0;
        java.text.DecimalFormat df3 = new java.text.DecimalFormat("0.000");
        
        while(Math.abs(error)>trueError && iterationNumber<20 && f(cPresent)!=0){   //If any condition of those three condition will be break, then the loop must be end.
            
            cPrev = cPresent;   //Previous Root (Relative Error).
            cPresent = ((a*f(b))-(b*f(a)))/(f(b)-f(a));
            
            iterationNumber++;
            System.out.println("Iteration Number : "+iterationNumber);
            System.out.println("A = "+a);
            System.out.println("B = "+b);
            System.out.println("f(A) = "+f(a));
            System.out.println("f(B) = "+f(b));
            
            if(f(a)*f(cPresent)<0){
                b=cPresent;
            } else{
                a=cPresent;
            }
            error = (cPresent-cPrev)/cPresent;  //Relative Error.
//            error = a-b;  //Absolute Error
            
            System.out.println("C/Root = "+cPresent);
            System.out.println("f(C) = "+f(cPresent));
            System.out.println("Estimated Error = "+df3.format(Math.abs(error*100))+"%\n");
        }        
        System.out.println("\n\n\n----------------------------------------------\n\n");
        System.out.println("Root Is : "+df3.format(cPresent)+"\n\n");
    }
    public static double f(double x){
        return 3*x - Math.cos(x) - 1;
    }
}
