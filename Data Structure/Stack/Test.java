package Stack;

public class Test {
    public static void main(String[] args) {
        Operation op1 = new Operation();
        op1.Push(1);
        op1.Push(5);
        op1.Push(3);
        op1.Push(8);
        op1.Push(9);
        op1.Push(2);     //Overflow
        op1.Show();
        
        op1.Pop();
        op1.Pop();
        op1.Pop();
        op1.Pop();
        op1.Pop();
        op1.Pop();       //Underflow
        op1.Show();
        
        op1.Push(1);
        op1.Push(6);
        op1.Show();
        op1.Pop();
        op1.Show();

        op1.Push(2);
        op1.Push(3);
        op1.Push(4);
        op1.Push(5);
        op1.Show();
        
        System.out.println("Peek is : "+op1.Peek());
        System.out.println("We Pop : "+op1.Pop());
        op1.Show();
    }
}
