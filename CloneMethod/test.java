package CloneMethod;

public class test {
    public static void main(String[] args) {
        try{
            A obj = new A("Sourav", 337);
            A obj1 = (A) obj.clone();
            obj.display();
        }
        catch(Exception a){
            
        }        
    }
}
