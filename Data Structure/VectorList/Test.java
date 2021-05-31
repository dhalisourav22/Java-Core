package VectorList;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(8);
        v.add(9);
        v.add(91);
        v.add(19);
        v.add(5);
        v.add(23);
        v.add(12);
        v.add(2);
        v.add(55);
        v.add(1);
        v.add(1);
        v.add(2, 4);
        int s = v.indexOf(91);
        v.removeAll(v);
        System.out.println("Index is  : "+s);
        for(int i : v){
            System.out.println(i);
        }
        System.out.println("Capacity is : "+v.capacity());
        
    }
}
