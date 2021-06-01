package FinalKeywordAll;

public class student {

    final String NAME = "Sourav";
    final int ID;
    static int AGE;

    student() {
        ID = 337;
    }
    static{
        AGE = 21;
    }
    void display(){
        System.out.println("Name is : "+NAME);
        System.out.println("Age is  : "+AGE);
        System.out.println("ID is   : "+ID);
    }
}
FinalKeywordAll