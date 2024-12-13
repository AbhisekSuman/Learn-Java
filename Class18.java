import java.util.Scanner;

public class Class18 {
    public static void main(String[] args) {
//        What we Learn
//          : -
        /*

         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************

//        for (int i = 6; i <= 10; i++) {
//            System.out.println("Hello");
//            break;
//        }
//  ================================================================================
//        for (int i = 6; i <= 10; i++) {
//            System.out.println("Hello");
//            if ( i == 6) {
//                break;
//            }
//        }
//  ===================================================================================
//        for (int i = 6; i <= 10; i++) {
//            System.out.println("Hello");
//            if ( i == 9) {
//                break;
//            }
//        }
//  =======================================================================
//        for (int i = 6; i <= 10; i++) {
//            System.out.println("Hello");
//            if (i == 6 && i == 7) {
//                break;
//            }
//        }

//  ========================================================================
//        int i = 6;

//        do {
//            System.out.println("Hello");
//            break;
//            i++;
//        } while (i <= 10);
//  ============================================================================
//        do {
//            System.out.println("Hello");
//            if ( i == 6) {
//                break;
//            }
//            i++;
//        } while (i <= 10);
//  =======================================================================
//        do {
//            System.out.println("Hello");
//            if ( i == 9) {
//                break;
//            }
//            i++;
//        } while (i <= 10);
//  =================================================================================
//        do {
//            System.out.println("Hello");
//            if (i == 6 && i == 7) {
//                break;
//            }
//            i++;
//        } while (i <= 10);

//  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            }
            System.out.println("world");
            i++;
        }

        do {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            }
            System.out.println("world");
            i++;
        } while (i <= 5);

        while (i <= 5) {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println("world");
            i++;
        }

        do {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println("world");
            i++;
        } while (i <= 5);

        while (i <= 5) {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            } else {
                System.out.println("World");
                break;
            }
//            i++;
        }

        do {
            System.out.println("Hello");
            if (i == 2) {
                continue;
            } else {
                System.out.println("World");
                break;
            }
//            i++;
        } while (i <= 5);

        while (i <= 5) {
            System.out.println("Hello");
            if (i == 1) {
                continue;
            } else if (i == 2) {
                System.out.println("How are you");
                break;
            } else if (i == 3) {
                System.out.println("World");
                continue;
            } else {
                continue;
            }
//            i++;
        }

        do {
            System.out.println("Hello");
            if (i == 1) {
                continue;
            } else if (i == 2) {
                System.out.println("How are you");
                break;
            } else if (i == 3) {
                System.out.println("world");
                continue;
            } else {
                continue;
            }
//            i++;
        } while (i <= 5);

//*******************************       Assignment      **************************************************

        /*

         */
    }

//    Methods || Classes
}
