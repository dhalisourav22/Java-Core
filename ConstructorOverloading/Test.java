package ConstructorOverloading;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher(111901203 , 20);
        Teacher t3 = new Teacher(119012030, 22, 4);
        t2.displayInfo();
        t3.displayInfo();
    }
}
