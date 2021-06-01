package InheritancePrivate;

public class Student extends Person {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    void display(){
        System.out.println("Name is : "+getName());
        System.out.println("ID is   : "+getId());
        
    }
}
