package Encpsulation;

public class Test {
    public static void main(String[] args) {
        setGet ob = new setGet();
        ob.setName("Sourav");
        ob.setAge(21);
        System.out.println("Name is : "+ob.getName());
        System.out.println("Age is  : "+ob.getAge());
        
    }
}
