package DataRead;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            File fileRead1 = new File("C:/Users/Sourav Dhali/Desktop/new.txt");
            Scanner scanner = new Scanner(fileRead1);
            while (scanner.hasNext()) {
                int id = scanner.nextInt();
                String name = scanner.next();
                System.out.println("ID is   : " + id);
                System.out.println("Name is : " + name);

            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error..!");
        }
    }
}
