package Inheritance;

public class Student {
    public String name;
    public int id;
    private double cgpa;
    public Student(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public Student(){
        
    }
    public void display(){
        System.out.println("ID is : "+this.id);
        System.out.println("Name is : "+this.name);
        System.out.println("CGPA is : "+this.cgpa);
    }
}
