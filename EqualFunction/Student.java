package EqualFunction;
public class Student {
    int id;
    String section, name;
    Student(int id, String section, String name ){
        this.id= id;
        this.section= section;
        this.name= name;
    }
    public boolean equals(Student s){
        if(this.section == s.section)
            return true;
        else
            return false;
    }
}
