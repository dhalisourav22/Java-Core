package ConstructorOverloading;

public class Teacher {
    int id, age, cgpa;
    Teacher(){
        System.out.println("We are teacher");
    }
    Teacher(int m, int n ){
        id = m;
        age = n;
    }
    Teacher(int m, int n, int j ){
        id = m;
        age = n;
        cgpa = j;
    }
    void displayInfo(){   //method
        System.out.println("ID   : "+id);
        System.out.println("AGE  : "+age);
        System.out.println("CGPA : "+cgpa);
        System.out.println("");
    }
}
