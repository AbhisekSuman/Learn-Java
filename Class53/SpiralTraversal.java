package Class53;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i <0; i++) {
            sum(arr[i]);
        }
    }
    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
