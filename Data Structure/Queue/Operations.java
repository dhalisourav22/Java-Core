package Queue;

public class Operations {

    int front, rear, size, length = 5;
    int[] array = new int[length];

    void Enqueue(int num) {
        if (size < length) {
            array[rear] = num;
            rear = (rear + 1) % length;
            size = size + 1;
        }
        else 
            System.out.println("Sorry. Your Queue Is Full..!");
    }
    int Dequeue() {
        if (!isEmpty()) {
            int data = array[front];
            front = (front + 1) % length;
            size = size - 1;
            return data;
        }
        else
            System.out.println("Sorry. Your Queue Is Empty..!");
        return 0;
    }
    void Show() {
        System.out.print("Element's are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front + i) % this.length] + " ,");
        }
        System.out.print("\b");
    }
    int getSize(){
        return size;
    }
    boolean isEmpty(){
        return this.getSize()==0;
    }
    boolean isFull(){
        return this.getSize()==this.length;
    }
}
