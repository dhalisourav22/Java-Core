package SupperKeyword;

public class car extends vichels{
    String name;
    
    car(String color, double weight, String name){
        super(color,weight);
        this.name = name;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Name is : "+name);
    }
}
