import java.util.Scanner;

public class EighthClass {

    public static void main(String[] args) {
//        What we Learn
//         Methods ->
        /*
            advantages: -
                - Moduliztion -> debuging becomes simpler because of separation
                - Reusablity
        */

//**************************        Probably Question   *********************************************
        /*


         */


//*********************************        Programme                 ********************************************

        System.out.println(add(10,20));
        sub();
        int res = mul(10,20);
        System.out.println(res);



//*******************************       Assignment      **************************************************

        /*

         */
    }

//    Methods OR Classes

    public static int add(int a, int b) {
        int x = 100;
        int y = 200;
        System.out.println("Addition: "+(x+y));
        return a+b;
    }

    public static void sub() {
        int m = 200;
        int n = 100;
        System.out.println((m-n));
    }

    public static int mul(int p, int q) {
        return p*q;
    }
}
