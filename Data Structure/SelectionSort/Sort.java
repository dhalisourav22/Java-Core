package SelectionSort;

public class Sort {
    public void SelectionSort(int[] Array){
        for (int i = 0; i < Array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < Array.length; j++) {
                if(Array[minIndex]>Array[j])
                    minIndex = j;
            }
            int temp = Array[minIndex];
            Array[minIndex] = Array[i];
            Array[i]= temp;
        }
    }
}
