package ArrayPatten;

public class ArrayPattenWithColValue {

    public static void main(String[] args) {
        int[][] array = new int[4][5];
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                array[row][col] = k;
                k++;
            }

        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("\t" + array[row][col]);

            }
            System.out.println();

        }
    }

}
