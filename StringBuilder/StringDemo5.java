package StringBuilder;

public class StringDemo5 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sourav");
        System.out.println("STR = "+str);
        str.append(" Dhali");
        str.append(22);
        str.append(12.5);
        System.out.println(""+str);
        str.reverse();
        System.out.println(str);
        str.delete(0, 2);
        System.out.println(str);
    }
}
