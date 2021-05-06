package BubbleSort;
public class Test {
    public static void BubbleSort(int[] Array){
        for (int i = 0; i < Array.length-1; i++) {
            for (int j = 0; j < Array.length-1-i; j++) {
                if(Array[j]>Array[j+1]){
                    int temp = Array[j+1];
                    Array[j+1] = Array[j];
                    Array[j] = temp;
                }
            }
        }        
    }    
    public static void main(String[] args) {
        int[] arr = {10,20,4,30,60,40,1,22,56};
        Test.BubbleSort(arr);
        for(int x : arr)
            System.out.print(x+" ,");
        System.out.println("\b");
    }
}
