package Interface;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        B[] obj = new B[4];
        obj[0] = new B(337,22);
        obj[1] = new B(321,21);
        obj[2] = new B(350,20);
        obj[3] = new B(319,23);
        Arrays.sort(obj);
        //System.out.println(Arrays.toString(obj));
        for(B x : obj){
            System.out.println(x);
        }
    }
}
