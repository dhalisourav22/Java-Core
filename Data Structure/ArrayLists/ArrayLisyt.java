package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLisyt {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();   //declearing
        System.out.println("Initial SIZE :" + number.size());
        number.add(10);        //intializing
        number.add(20);
        number.add(40);
        number.add(3, 30);

        System.out.println(number);    //showing in easy way
        for (int x : number) {     //for each loop
            System.out.print(x + " ");
        }
        System.out.println("");
        Iterator itr = number.iterator();  //iterator loop
        while (itr.hasNext()) {        //until itr have value
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nFinal SIZE : " + number.size());   //showing size
        number.remove(2);    //removing by index
        System.out.println(number);
        //number.removeAll(number);   //removing all
        //System.out.println(number);
        //number.clear();    //clearing
        //ystem.out.println("After clear : "+number);
        boolean check = number.isEmpty();   //checking Empty
        System.out.println("Empty : " + check);
        boolean contain = number.contains(40);
        System.out.println("Is 40 has there : " + contain);
        boolean contai = number.contains(30);   //contain in the array or not
        System.out.println("Is 30 has there : " + contai);
        int ch = number.indexOf(30);   //showing index number4
        System.out.println("Index of 30 is now : " + ch);
        number.set(2, 50);  //replace value
        System.out.println("After replaceing : "+ number);
        System.out.println("The value of 0 index: "+number.get(0));  //geeting value by index number
    }
}
