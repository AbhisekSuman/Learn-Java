import java.util.Scanner;

public class Class19 {
    public static void main(String[] args) {
//        What we Learn
//          : -
        /*

         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************
//        NestedFor();
//        System.out.println("-----------------------Nested While ---------------------------");
//        NestedWhile();
//        System.out.println("-----------------------Nested Do While----------------------------");
//        NestedDoWhile();

        Virat:
        for (int i = 1; i <= 3; i++) {
            Anuska:
            for (int j = 1; j <= 3; j++) {
                if (i == 1) {
                    System.out.println("Kodnest");
                    break Virat;
                }
                System.out.println("--------------------------------------------------------");
            }
        }
//*******************************       Assignment      **************************************************

        /*

         */
    }

    public static void NestedFor() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Kodnest");
            }
            System.out.println("=================================================");
        }
    }

    public static void NestedWhile() {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("Kodnest");
                j++;
            }
            System.out.println("============================================");
            i++;
        }
    }

    public static void NestedDoWhile() {
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.println("Kodnest");
                j++;
            } while (j <= 3);
            System.out.println("=================================");
            i++;
        } while (i <= 3);
    }
}


