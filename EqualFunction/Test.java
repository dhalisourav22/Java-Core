package EqualFunction;
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(337,"4B","Sourav");
        Student s2 = new Student(335,"4A","Tamim");
        Student s3 = new Student(350,"4B","Juthi");
        //s1=s3;
        //Student s1 = s3;
        if(s1.equals(s3)){
            System.out.println("Yse. "+s1.name+" and "+s3.name+" are in the same section.");
        }
        else{
            System.out.println("No. "+s1.name+" and "+s3.name+" are not in the same section.");
        }
    }
}
