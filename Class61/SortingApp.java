package Class61;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingAlgo sortingAlgo = new SortingAlgo();

        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sorted Array is: ");
        int[] sortedArr = sortingAlgo.bubbleSort(arr);
        for (int x: sortedArr) {
            System.out.print(x + " ");
        }
        
    }
}
