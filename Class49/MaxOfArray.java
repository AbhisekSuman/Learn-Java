package Class49;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Length: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                    max = arr[i];
            }
        }

        System.out.println("Max is " + max);
    }
}
