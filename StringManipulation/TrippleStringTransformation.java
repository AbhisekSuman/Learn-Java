package StringManipulation;

import java.util.Scanner;

public class TrippleStringTransformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        s1 = s1.replaceAll("[aeiou]","%");

        String s2 = scanner.next();
        s2 = s2.replaceAll("[^aeiou]", "#");

        String s3 = scanner.next();
        s3 = s3.toUpperCase();

        String s = s1 + s2 + s3;
        System.out.println(s);
    }
}
