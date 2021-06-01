package ThisKeyword;

public class person {
    String name;
    int age,id,a;

    public person() {
        a =10;
    }
    
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void massege(){
        System.out.println("Name is : "+name);
        System.out.println("Age is  : "+age);
    }
    
    person(String name, int age, int id){
        this(name, age);
        this.id=id;
    }
    void display(){
        this.massege();
        System.out.println("Id is   : "+id);
    }
}
