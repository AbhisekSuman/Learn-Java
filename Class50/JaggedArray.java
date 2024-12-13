package Class50;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int x : arr[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
