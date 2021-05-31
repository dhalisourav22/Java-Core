package CloneMethod;

public class A implements Cloneable{
    String name;
    int id;
    public A(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void display(){
        System.out.println("The name is : "+this.name);
        System.out.println("The ID id : "+this.id);
    }
}
