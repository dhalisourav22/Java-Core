package ToString;
public class man {
    public int age;
    public String name;
    public man (int age , String name){
        this.age =  age;
        this.name = name;
    }
    public void show(){
        System.out.println("This is man class");
    }
    public String toString(){
        String tS = "Age : "+this.age+"\nName : "+this.name;
        return tS;
    }
}
