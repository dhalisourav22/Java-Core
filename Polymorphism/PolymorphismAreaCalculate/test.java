package PolymorphismAreaCalculate;

public class test {
    public static void main(String[] args) {
        shape[] s = new shape[3]; 
        s[0] = new traiangle(10,25);
        s[1] = new rectangular(15,25);
        s[2] = new shape();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("The answer is : "+s[i].area());
        }
        
    }
}
