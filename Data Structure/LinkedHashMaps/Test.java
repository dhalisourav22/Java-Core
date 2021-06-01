package LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test{
    public static void main (String[] args) {
        LinkedHashMap<Integer,String> list = new LinkedHashMap();
        list.put(10, "Sourav");
        list.put(12, "Juthi");
        list.put(25, "Kapil");
        list.put(123, "Hardik");
        
        list.remove(25);
        System.out.println("The Linked Hash-Map is : "+list);
        System.out.println("Geting value : "+list.get(12));
        
        System.out.println("Is It Empty : "+list.isEmpty());
        
        System.out.println("All Values are : "+list.values());
        System.out.println("All Keys are : "+list.keySet());
        
        System.out.println("Is It contain sourav : "+list.containsValue("Sourav"));
        System.out.println("Is It contain 1235 Key : "+list.containsKey(1235));
        
        Set<Integer> allKey = list.keySet();
        for(Integer x : allKey){
            System.out.println("The key : "+x+" == The Value Is : "+list.get(x));
        }
        System.out.println("------------------------------------------------------------");
        Set<Map.Entry<Integer,String>> allThings = list.entrySet();
        for(Map.Entry<Integer,String> x : allThings){
            System.out.println("The Key : "+x.getKey()+" == The value : "+x.getValue());
        }
    }
}
