package StudentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        HashMap<Integer,Student> list = new HashMap<Integer,Student>();
        //Adding Element In Student Object.
        Student[] s =new Student[3];
        s[0] = new Student("Sourav",337);
        s[1] = new Student("Sabuj", 369);
        s[2] = new Student("Juthi", 350);
        //Adding Element In HashMap.
        list.put( 1 , s[0]);
        list.put( 2 , s[1]);
        list.put( 3 , s[2]);
        //System.out.println("You Have : "+list);
//        Set<Integer> allKey = list.keySet();
//        for(int x : allKey){
//            System.out.println(x+" == Name Is : "+list.get(x).name+" ID Is : "+list.get(x).id+" University Name is : "+Student.uniName);
//        }
        Set<Map.Entry<Integer,Student>> allThing = list.entrySet();
        for(Map.Entry<Integer,Student> x : allThing){
            System.out.println(x.getKey()+" == Name is : "+x.getValue().name+" ID is : "+x.getValue().id+" University Name Is : "+Student.uniName);
        }

    }
}
