package Class49;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] reversedArray = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reversedArray[j] = arr[i];
            j--;
        }

        for (int x : reversedArray) {
            System.out.print(x + " ");
        }
    }
}
