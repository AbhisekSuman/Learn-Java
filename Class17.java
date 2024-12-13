import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
//        What we Learn
//          : -
        /*

         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

//        factorial(n);

//        Class15 class15 = new Class15();
//        class15.findFactorial(n);

        System.out.println("Factorial of " + n + " is " + factorial(n));

//*******************************       Assignment      **************************************************

        /*

         */
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
