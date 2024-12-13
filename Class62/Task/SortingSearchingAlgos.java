package Class62.Task;

import java.util.Scanner;

public class SortingSearchingAlgos {
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int mid = (st + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;
            while (j >= 0 && item < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = item;
        }
        return arr;
    }
}
