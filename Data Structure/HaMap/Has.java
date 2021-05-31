package HaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Has {
    public static void main(String[] args) {
        HashMap<String,String> pb = new HashMap<String,String>();
        pb.put("Sourav", "01986614843");
        pb.put("Nahid", "01764235171");
        pb.put("Turtja", "01728905588");
        pb.put("Juthi", "01742299506");
        //Easily Output
        System.out.println("The Hash Map Is : "+pb);
        System.out.println("Geting Number of Sourav is : "+pb.get("Sourav"));
        //Removing
        pb.remove("Nahid");
        System.out.println("The Hash Map Is : "+pb);
        //Size.
        System.out.println("The Size is : "+pb.size());
        Set<String> k = pb.keySet();
        for(String x : k){
            System.out.print(x+" : "+pb.get(x)+".\n");
        }
        //map entry
        System.out.println("By Entry : ");
        Set<Map.Entry<String,String>> kvAll = pb.entrySet();
        for(Map.Entry<String,String> x : kvAll){
            System.out.print(x.getKey()+" : "+x.getValue()+".  ");
        }
        pb.clear();
        System.out.println("PB is after clearing : "+pb);
    }
}
