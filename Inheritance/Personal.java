package Inheritance;

public class Personal extends Student{
    public static String uniName = "NUB";
    public Personal(String name, int id, double cgpa, String uniName){
        super(name, id, cgpa);
        this.uniName = uniName;
    }
    public void display(){
        super.display();
        System.out.println("University is : "+this.uniName);
    }
}
