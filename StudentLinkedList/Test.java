package StudentLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        //Student Type LinkedList
        LinkedList<Student> list = new LinkedList();
        Scanner input = new Scanner(System.in);
        
        //InFo ADD.
        System.out.print("How Many Student : ");
        int number = input.nextInt();
        Student[] stu = new Student[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter "+(i+1)+" Student Name : ");
            input.nextLine();
            String Name = input.nextLine();
            System.out.print("Enter "+(i+1)+" Student ID : ");
            int Id = input.nextInt();
            System.out.print("Enter "+(i+1)+" Student Number : ");
            String Number = input.next();
            stu[i] = new Student(Name,Number,Id);
            list.add(stu[i]);
        }
        
        //Showing The Value.
        //System.out.println(list);
        
        //Showing The Value. In Another Way.
        for(Student s : list){
            System.out.println("\nName : "+s.name+"\nID : "+s.id+"\nPhone : "+s.phoneNum+".");
        }
    }
}
