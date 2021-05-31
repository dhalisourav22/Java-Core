package StudentLinkedList;

public class Student {
    String name, phoneNum;
    int id;

    public Student(String name, String phoneNum, int id) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.id = id;
    }
    public String toString(){
        return "Name : "+this.name+"\nID : "+this.id+"\nPhone : "+this.phoneNum+".\n\n";
    }
    
    
}
