package Static;

public class Student {

    String name;
    int id;
    static String uniName = "NUB";

    Student(String n, int id) {
        name = n;
        this. id = id;

    }

    void display() {
        System.out.println("Name is : " + name);
        System.out.println("ID is : " + id);
        System.out.println("University Name is: " + uniName);
    }

}
