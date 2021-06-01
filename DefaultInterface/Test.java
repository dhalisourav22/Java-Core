package DefaultInterface;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ObjectSorting[] obj= new ObjectSorting[4];
        obj[0] = new ObjectSorting(337, 22, "Sourav");
        obj[1] = new ObjectSorting(350, 21, "Juthi");
        obj[2] = new ObjectSorting(335, 23, "Tamim");
        obj[3] = new ObjectSorting(357, 20, "Shuvo");
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));
        /*for(ObjectSorting x : obj){
            System.out.println(x.toString());
        }*/
    }
}
