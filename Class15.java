import java.util.Scanner;

public class Class15 {

    public static void main(String[] args) {
//        What we Learn
//          Loop: -
        /*

         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("Enter 2 numbers to perform Addition: ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int res = a + b;

            System.out.println("SUM IS: " + res);
            i++;
        } while (i < 5);

//*******************************       Assignment      **************************************************

        /*

         */
    }

    public void findFactorial (int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }

}
