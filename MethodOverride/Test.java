package MethodOverride;

public class Test {
    public static void main(String[] args) {
        STudent s1 = new STudent();
        s1.name = "Sourav";
        s1.age = 21;
        s1.uniName = "NUB";
        s1.displayInfo();
        
        Person p1 = new Person();
        p1.name = "Sabuj";
        p1.age = 19;
        p1.displayInfo();
    }
}
