package RegularFalsiMethod;
public class Falsi {
        public static void main(String[] args) {
        double a = 0, b = 1, c = 0, trueError = 0.1, error = a-b;
        int iterationNumber = 0;
        while(Math.abs(error)>trueError && iterationNumber<20 && f(c)!=0){   //If any condition of those three condition will be break, then the loop must be end.
            double cPrev = c;   //Previous Root (Relative Error).
            c = ((a*f(b))-(b*f(a)))/(f(b)-f(a));
            if(f(a)*f(c)<0){
                b=c;
            }
            else{
                a=c;
            }
            error = (cPrev-c)/cPrev;  //Relative Error.
//            error = a-b;  //Absolute Error
            iterationNumber++;
            System.out.println("Iteration Number : "+iterationNumber);
            System.out.println("A = "+a);
            System.out.println("B = "+b);
            System.out.println("f(A) = "+f(a));
            System.out.println("f(B) = "+f(b));
            System.out.println("C/Root = "+c);
            System.out.println("f(C) = "+f(c));
            System.out.println("Estimated Error = "+error+"\n");
        }
        System.out.println("\n\n\n----------------------------------------------\n\n");
        System.out.println("Root Is : "+c);
        System.out.println("Error Is : "+error);
    }
    public static double f(double x){
        return 4*Math.pow(x, 3) - 6*Math.pow(x, 2) + 7*x - 2.3;
    }
}
