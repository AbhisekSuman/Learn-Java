package StringManipulation;

import java.util.Scanner;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String largest = "";
        for (int i = 0; i < str.length(); i++) {
            String subString = "";
            for (int j = i; j < str.length(); j++) {
                subString = subString + str.charAt(j);
                if (isPalindrome(subString)) {
                    if (subString.length() >= largest.length()) {
                        largest = subString;
                    }
                }
            }
        }
        System.out.println(largest);
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static String reverse(String s) {
        String string = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            string = string + s.charAt(i);
        }
        return string;
    }
}
