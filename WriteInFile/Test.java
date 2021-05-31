package WriteInFile;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int id;
        String name;
        Scanner input = new Scanner(System.in);
        try{
            File folder1 = new File("C:/Users/Sourav Dhali/Desktop/New Folder");
            folder1.mkdir();
            System.out.println(folder1.getName()+" Has Been Create Sucesfully..!");
            String path = folder1.getAbsolutePath();
            File file1 = new File(path+"/index.txt");
            file1.createNewFile();
            System.out.println(file1.getName()+" File Has Been Create Sucesfully..!");
            Formatter fileWrite1 = new Formatter(file1.getAbsolutePath());
            System.out.print("How Many Student Info You Want To Add : ");
            int numberOfStudent = input.nextInt();
            for (int i = 0; i < numberOfStudent; i++) {
                int count=0;
                do {
                    try {
                        System.out.print("Enter No " + (i + 1) + " Student ID : ");
                        id = input.nextInt();
                        System.out.print("Enter No " + (i + 1) + " Student Name : ");
                        name = input.next();                        
                        fileWrite1.format((i+1)+". Student Name is : "+name+".\n   Student ID is : "+id+".\n");
                        System.out.println("Your No " + (i + 1) + " Student Info Will Be Taken..!");
                        count++;
                    } catch (Exception e) {
                        System.out.println("You Enter Invalid Type Of NAME Or ID..!\nPlease Enter Again..!");
                        input.next();
                    }
                } while (count == 0);
            }
            fileWrite1.close();          
        }catch(Exception e){
            System.out.println("You Must Do Something Wrong In Making File..!");
        }
    }
}
