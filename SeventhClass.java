import java.util.Scanner;

public class SeventhClass {

    public static void main(String[] args) {
// ****************************     What we Learn       *********************************************
        /*
//            Segments of JRE

                there are 4 sengement of JRE-
                    - Code Segment
                    - Static Segment
                    - Stack Segment
                    -

                    Methods uses the Stack Segment
                    Stack Frame/ Activa
         */


//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************

        add();
        sub(20,10);
        System.out.println(mul());
        double divResult = div(60,3);
        System.out.println(divResult);

//*******************************       Assignment      **************************************************

        /*

         */
    }

    public static void add() {
        int a = 20, b = 60;
        System.out.println(a+b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static int mul() {
        int a  = 50, b = 2;
        return a*b;
    }

    public static double div(int a, int b) {
        return (double) a /b;
    }
}
