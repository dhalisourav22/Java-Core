package File;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Sourav Dhali/Desktop/New Folder");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        System.out.println("Your Folder Name Is : "+dir.getName());
        System.out.println("Path is : "+path);
        //Here we delete the folder.
//        if(dir.delete()){
//            System.out.println("We Delete Your "+dir.getName()+" Folder.");
//        }

        File file1 = new File(path+"/new.txt");
        File file2 = new File(path+"/new1.java");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Your Two File Create Succesfully..!");
        }catch(Exception e){
            System.out.println("You Must Do Something Wrong...!\nException is : "+e);
        }
        file1.delete();
        if(file1.exists()){
            System.out.println("This "+file1.getName()+" Is Exist.");
        }
        else
            System.out.println("This "+file1.getName()+" Dose Not Exist.");
    }
}
