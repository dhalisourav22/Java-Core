package HasSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class Runner {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<String>();
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("How Many Student You Have : ");
        int amountOfStudents = input.nextInt();
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.print("Enter The Boys ID : ");
            String id = input.next();
            if(coll.add(id)==false){
                System.out.println("You Already Add That..!");
                i--;
            }            
        }
        System.out.println("The Collection Is : "+coll);
    }
}
