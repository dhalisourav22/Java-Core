package BisectionMethod;
public class Bisection {
    public static void main(String[] args) {
        double a = 0, b = 1, c = 0, trueError = 0.001, cPrev =0, error = a-b;
        int iterationNumber = 0;              
        
        while(Math.abs(error)>trueError && iterationNumber<15 && f(c)!=0){   //If any condition of those three condition will be break, then the loop must be end.
            
            cPrev = c;       //Previous Root (Relative Error) And This Is Also Need For Final Answer (Root).
            c = (a+b)/2;
            
            iterationNumber++;
            System.out.println("Iteration Number : "+iterationNumber);
            System.out.println("A = "+a);
            System.out.println("B = "+b);
            System.out.println("f(A) = "+f(a));
            System.out.println("f(B) = "+f(b));
            
            if(f(a)*f(c)<0){
                b=c;
            } else{
                a=c;
            }
            
           error = (cPrev-c)/cPrev;  //Relative Error.
//            error = a-b;   //Absolute Error.            

            System.out.println("C/Root = "+c);
            System.out.println("f(C) = "+f(c));
            System.out.println("Estimated Error = "+error+"\n");
        }
        System.out.println("\n\n\n----------------------------------------------\n\n");
        System.out.println("Root Is : "+cPrev+"\n\n");
    }
    public static double f(double x){
        return 3*x - Math.cos(x) - 1 ;
    }
}
