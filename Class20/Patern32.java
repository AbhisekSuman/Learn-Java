package Class20;

import java.util.Scanner;

public class Patern32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the Row and Column Value: ");
        int row = scanner.nextInt();
        // int column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == row || j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
