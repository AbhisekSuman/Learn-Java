package Class20;

import java.util.Scanner;

public class Patern33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the Row and Column Value: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 5; j >= i; j--) {
                if (i == 1 || i == row || j == 5 || j == i) {
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
