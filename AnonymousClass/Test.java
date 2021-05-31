package AnonymousClass;

public class Test {
    public static void main(String[] args) {
        A obj = new A(){
          public void display(){
              System.out.println("Display Of Test");
          }
        };
        obj.display();
        obj.show();
        A obj2 = new A();
        obj2.display();
        A obj1 = new A(){
            
        };
        obj1.display();
    }
}
