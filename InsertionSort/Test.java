package InsertionSort;

public class Test {
    public static void InsertionSort(int[] Array){
        for (int i = 1; i < Array.length; i++) {
            int Temp = Array[i];
            int j = i-1;
            while(j>=0 && Array[j]>Temp){
                Array[j+1] = Array[j];
                j = j-1;
            }
            Array[j+1] = Temp;
        }
    }    
    public static void main(String[] args) {
        int[] arr = {2,10,3,20,30,3};
        Test.InsertionSort(arr);
        for(int x : arr)
            System.out.print(x+" ,");
    }
}
