package PolymorphismnBasic;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        p = new Teacher();  //run-time polymorphism
        p.display();
        Person q = new Student();  //p and q are vthe reference object
        q.display();
    }
}