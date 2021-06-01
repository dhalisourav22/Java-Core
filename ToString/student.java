package ToString;
public class student extends man {
    int id;
    String uniName;
    
    public student(int age , String name ,int id){
        super(age,name);
        this.id = id;
        this.uniName = "NUBT";
    }
    @Override
    public void show(){
        super.show();
        System.out.println("this is student class");
    }
    public String toString(){
        return super.toString()+"\nid : "+this.id+"\nUniversity : "+this.uniName;
    }
    
}
