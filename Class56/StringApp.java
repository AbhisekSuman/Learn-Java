package Class56;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringManipulation stringManipulation  = new StringManipulation();

        String s = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("Before reverse the String: " + s);
//        String rev = stringManipulation.stringReverse(s);
//        System.out.println("After reverse the string: " + rev);
//
//        System.out.println(s);
//        String reverse = stringManipulation.strinReverseWithSpace(s);
//        System.out.println(reverse);

//        System.out.println(stringManipulation.wordReverseInString(s));
//        System.out.println(stringManipulation.rotationCheck(s,s2));

        stringManipulation.printSubString(s);
    }
}
