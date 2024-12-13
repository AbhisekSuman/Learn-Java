package Class53;

import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};;
        int[][] arr2 = new int[][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] arrSum = new int[3][3];

        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < arrSum[i].length; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(Arrays.deepToString(arrSum));
    }
}
