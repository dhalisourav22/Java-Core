package NewtonRaphsonMethod;
public class NewtonRaphson {
    public static void main(String[] args) {
        boolean isError = true;
        do{
            try{
                double x0,trueError=0.0001,error;
                int iterationNumber=0;
        
                System.out.print("Enter The Value Of x0 : ");
                java.util.Scanner input = new java.util.Scanner(System.in);
                x0 = input.nextDouble();
        
                java.text.DecimalFormat df3 = new java.text.DecimalFormat("0.000");
        
                while( iterationNumber<15 && f(x0)!=0 ){            
                    double value = x0;   //Previous Root(Absolute and Relative Error).
                    x0 = x0 - (f(x0)/fd(x0));                    
                    
                    error = (x0 - value)/x0;  //Relative Error.
//                    error = Math.abs(value-x0);   //Absolute Error.

                    iterationNumber++;
                    System.out.println("\nIteration Number : "+iterationNumber);
                    System.out.println("X"+iterationNumber+" : "+x0);
                    System.out.println("f(x"+iterationNumber+") : "+f(x0));
                    System.out.println("f'(x"+iterationNumber+") : "+fd(x0));
                    System.out.println("X"+(iterationNumber+1)+" : "+(x0 - (f(x0)/fd(x0))));
                    System.out.println("Error : "+df3.format(Math.abs(error*100))+"%");            
            
                    if(Math.abs(error)<trueError){
                        break;
                    }
                }
                System.out.println("\n_______________________________________________________\n");
                System.out.println("Solution : ");
                System.out.println("_______________________________________________________\n");
                System.out.println("The Root Is : "+df3.format(x0)+"\n\n\n");
                isError = false;
            }
            catch(Exception e){
                System.out.println("_______________________________________________________\n");
                System.out.println("Please Enter Valid Input type(Integer) Of X0. Try Again!  ");
                System.out.println("_______________________________________________________\n");
            }
        }while(isError == true);        
    }           
    public static double f(double x){
        return 3*x - Math.cos(x) - 1;
    }
    public static double fd(double x){
        return 3 + Math.sin(x);
    }
}
