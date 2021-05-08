package Stack;

public class Operation {
    protected int arrayLength = 5;
    protected int[] Array = new int[arrayLength];
    protected int Top = -1;
    
    protected void Push(int number){
        Top++;
        if (Top < arrayLength){
            Array[Top] = number;
        }
        else{
            Top--;
            System.out.println("Stack Is Full...!");
        }
    }
    protected int Pop() {
        if (Top >= 0) { 
            int data = Array[Top];
            Array[Top] = 0;
            Top--;
            return data;
        }
        else if(Top==-1){
            System.out.println("Stack Is Empty..!");
            int data = 0;
            return data;
        }
        return 0;
    }
    protected int Peek() {
        if(Top==-1)
            Top++;
        return Array[Top];
    }
    public void Show(){
        System.out.print("Finaly The Stack is : ");
        for (int x : Array) {
            System.out.print(x + ", ");
        }
        System.out.println("\b\b.");
    }
}
