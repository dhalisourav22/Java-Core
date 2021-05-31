package Formatter;

import java.util.Formatter;

public class Test {
    public static void main(String[] args) {
        try{
            Formatter write = new Formatter("C:/Users/Sourav Dhali/Desktop/New Folder/new6.txt");
            write.format("I am a bad boy.\n");
            write.format("I am a very bad boy.\n");
            write.close();
        }catch(Exception e){
            
        }
    }
}
