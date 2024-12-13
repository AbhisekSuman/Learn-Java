package Class20;

public class Patern30 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= 1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 5; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (i == n || j == 1 || j == i) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i++) {
            int k = i;
            for (int j = 1; j <= 5; j++,k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

    }
}
