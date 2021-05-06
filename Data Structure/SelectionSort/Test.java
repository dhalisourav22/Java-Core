package SelectionSort;

public class Test {
    public static void main(String[] args) {
        int[] arr ={1,58,20,9,6,25,3,21,40,-40};
        Sort s = new Sort();
        s.SelectionSort(arr);
        for(int x : arr){
            System.out.print(x+" ,");
        }
        System.out.println("\b");
    }
}
