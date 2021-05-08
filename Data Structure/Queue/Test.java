package Queue;

public class Test {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        op1.Enqueue(2);
        op1.Enqueue(8);
        op1.Enqueue(3);
        op1.Enqueue(5);
        op1.Dequeue();
        op1.Dequeue();
        op1.Dequeue();
        op1.Dequeue();
        op1.Dequeue();
        op1.Enqueue(4);
        op1.Enqueue(3);
        op1.Enqueue(1);
        op1.Enqueue(1);
        op1.Enqueue(1);
        System.out.println(op1.isFull());

        op1.Show();
    }
}
