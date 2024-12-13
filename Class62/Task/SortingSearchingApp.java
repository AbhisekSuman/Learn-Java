package Class62.Task;

import java.util.Scanner;

public class SortingSearchingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingSearchingAlgos algos = new SortingSearchingAlgos();

        System.out.println("Enter length");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("Enter " + arr.length + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Press 1 to Search");
        System.out.println("Press 2 to Sort");

        switch (scanner.nextInt()) {
            case 1:
                int key;
                System.out.println("Press 'A' to Linear Search");
                System.out.println("Press 'B' to Binary Search");
                switch (scanner.next().charAt(0)) {
                    case 'A':
                        System.out.println("Enter the key to Search");
                        key = scanner.nextInt();
                        System.out.println("The key found at index: " + algos.linearSearch(arr, key));
                        return;
                    case 'B':
                        System.out.println("Choose 'b' for bubble sort");
                        System.out.println("Choose 's' for selection sort");
                        System.out.println("Choose 'i' for insertion sort");
                        char c = scanner.next().charAt(0);
                        switch (c) {
                            case 'b':
                                arr = algos.bubbleSort(arr);
                                break;
                            case 's':
                                arr = algos.selectionSort(arr);
                                break;
                            case 'i':
                                arr = algos.insertionSort(arr);
                                break;
                            default:
                                arr = algos.bubbleSort(arr);
                                break;
                        }
                        System.out.println("Elements are: ");
                        displayElements(arr);
                        System.out.println();
                        System.out.println("Enter key to search: ");
                        key = scanner.nextInt();
                        System.out.println("The key found at index: " + algos.binarySearch(arr, key));
                        return;
                    default:
                        System.out.println("Enter the key to Search");
                        key = scanner.nextInt();
                        System.out.println("The key found at index: " + algos.linearSearch(arr, key));
                        return;
                }
            case 2:
                System.out.println("Choose 'b' for bubble sort");
                System.out.println("Choose 's' for selection sort");
                System.out.println("Choose 'i' for insertion sort");
                char c = scanner.next().charAt(0);
                switch (c) {
                    case 'b':
                        arr = algos.bubbleSort(arr);
                        break;
                    case 's':
                        arr = algos.selectionSort(arr);
                        break;
                    case 'i':
                        arr = algos.insertionSort(arr);
                        break;
                    default:
                        arr = algos.bubbleSort(arr);
                        break;
                }
                System.out.println("Elements after sorting are: ");
                displayElements(arr);
        }
    }

    public static void displayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
