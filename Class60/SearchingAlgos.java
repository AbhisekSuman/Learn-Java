package Class60;

public class SearchingAlgos {

    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid]) {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return -1;
    }
}
