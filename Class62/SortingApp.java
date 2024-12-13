package Class62;

import java.util.Arrays;
import java.util.Scanner;

public class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingAlgo sortingAlgo = new SortingAlgo();

        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(sortingAlgo.selectionSort(arr)));
        System.out.println(Arrays.toString(sortingAlgo.insertionSort(arr)));
    }
}
