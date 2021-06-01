package DefaultInterface;

public class ObjectSorting implements Comparable<ObjectSorting>{
    int id, age;
    String name;
    ObjectSorting(int id , int age, String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "\n\nId is : "+this.id+"\nName is : "+this.name+"\nAge : "+this.age;
    }

    @Override
    public int compareTo(ObjectSorting t) {
        if(this.id > t.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}
