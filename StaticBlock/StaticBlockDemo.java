package StaticBlock;
public class StaticBlockDemo {
    static int id ;
    static String name ;
    static{
        id = 337;
        name = "Sourav";
    }
    static void display(){
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
    public static void main(String[] args) {
        StaticBlockDemo.display();
    }
    
}
