package MethodOverride;

public class STudent extends Person {

    String uniName;


    @Override
    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("University : "+uniName);
    }
}
