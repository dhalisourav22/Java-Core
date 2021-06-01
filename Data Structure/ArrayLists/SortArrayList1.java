package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number;
        number = new ArrayList <> ();
        number.add(10);
        number.add(-88);
        number.add(0);
        number.add(-8);
        number.add(40);
        
        System.out.println(number);
        
        Collections.sort(number);     //sort
        System.out.println("Ascendring order : "+number);
        
        Collections.sort(number,Collections.reverseOrder());     //revers sort
        System.out.println("Decendring order : "+number);
    }
}
