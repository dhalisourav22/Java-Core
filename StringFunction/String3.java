package StringFunction;

public class String3{
    public static void main(String[] args) {
        String s1 = "My name is sourav dhali";
        String s2 = s1.replace('a', 'c');
        System.out.println("Aftter replecing : " +s2);
        System.out.println("Before replecing : " +s1);
        
        String[] s3 = s1.split(" ");   //devide in array by space
        System.out.println(""+s3[1]);
        for(String x : s3){
            System.out.println(x+"");
        }
    }
}
