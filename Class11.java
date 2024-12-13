import java.util.Scanner;

public class Class11 {

    public static void main(String[] args) {
//        What we Learn
//          ->
        /*

         */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************



//        System.out.println("Enter a number to calculate square and cube: ");
//        Scanner scanner = new Scanner(System.in);
//
//        int num = scanner.nextInt();
//
//        System.out.println("Cube of "+num+" is: "+cube(num));

//        start();
//
//        Demo demo = new Demo();
//        demo.greet("Hey..");
//
//        System.out.println("Right shift of 8 is: " + Demo.rightShift(8));
//
//        Class11 class11 = new Class11();
//        System.out.println("Remainder is: "+class11.getRemainder(10,6));
//


//*******************************       Assignment      **************************************************

        /*

         */
    }

//    Methods OR Classes

    public int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num*num*num;
    }

    public static void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a char: ");
       char a = scanner.next().charAt(0);

        System.out.println("The Character is: " + a);

//      add 5 to and to char and store it in a var
       a = (char) (a+5);
        System.out.println("The New Character is: " + a);

        int x = (int) a;
        x = x<<2;
        System.out.println("Result is: " + x);
    }

    public static void start() {
        System.out.println("Application Started ..........");
    }

    public int getRemainder (int a, int b) {
        return a%b;
    }

}

class Demo {
    public void greet(String name)
    {
        System.out.println("Hello " + name);
    }

    public static int rightShift(int num) {
        return num>>1;
    }
}
