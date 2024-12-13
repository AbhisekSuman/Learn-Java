import java.util.Scanner;

public class Class12 {

    public static void main(String[] args) {
//        What we Learn
//          Control Construct
        /*
            it is the mechanism to construct the control flow of a Java Application.
         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age: ");
//        int age = scanner.nextInt();
//
//
//        if (age >= 18) {
//            System.out.println("You are eligible to Vote as your age is: " + age);
//        }
//        else {
//            System.out.println("You are eligible to Vote as your age is: " + age);
//        }


        int marks = scanner.nextInt();

        if (marks >= 85) {
            System.out.println("Wow You are Amazing!!");
        }
        else if (marks >= 75 && marks < 85) {
            System.out.println("Performing Good");
        } else if (marks >= 65 && marks < 75) {
            System.out.println("Doing good but try to archive more");
        } else if (marks >= 45 && marks < 65) {
            System.out.println("Try to Improve");
        }
        else {
            System.out.println("Better luck Next time");
        }
//*******************************       Assignment      **************************************************

        /*

         */
    }

}
