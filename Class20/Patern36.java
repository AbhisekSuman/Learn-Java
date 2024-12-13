package Class20;

import java.util.Date;
import java.util.Scanner;

public class Patern36 {
    public static void main(String[] args) {
//        for (int i = 9; i >= 1; i -= 2) {
//            for (int j = 9; j > i; j -= 2) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 3; i <= 9; i += 2) {
//            for (int j = 9; j > i; j -= 2) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i+j >= n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
