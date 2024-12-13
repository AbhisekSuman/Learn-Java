package Class60;

import java.util.Scanner;

public class SearchingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchingAlgos searchingAlgos = new SearchingAlgos();

        System.out.println("Enter Array Size");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the key to search ");
        int key = scanner.nextInt();

        System.out.println("Enter a number for searching method: ");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int method = scanner.nextInt();
        int res;
        switch (method) {
            case 1:
                res = searchingAlgos.linearSearch(arr, key);
                break;
            case 2:
                res = searchingAlgos.binarySearch(arr, key);
                break;
            default:
                System.out.println("Sorry!  invalid...");
                return;
        }
        System.out.println("Searching......");

        if (res > 0) {
            System.out.println("Yeh! Key founded at-> " + res);
        }
        else
            System.out.println("ohh! Key not found...");

        scanner.close();
    }
}
