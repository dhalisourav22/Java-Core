package Static_3_count;

public class Student {
    static int count  = 0;
    Student(){
        count++;
    }
    void display(){
        System.out.println("The number of object is : "+count);
    }
    
}
