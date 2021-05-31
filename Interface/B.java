package Interface;
public class B implements Comparable<B> {

    int age, id;
    protected B(int id , int age){
        this.id = id;
        this.age = age;            
    }
    
    @Override
    public String toString(){
        return "Id  : "+this.id+"\nAge : "+this.age+"\n";
    }

    @Override
    public int compareTo(B t) {
        if(this.id > t.id){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
