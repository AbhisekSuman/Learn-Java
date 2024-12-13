package Class62;

public class SortingAlgo {
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[pos] = temp;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;
            while (j >= 0 && item < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
        return arr;
    }
}
