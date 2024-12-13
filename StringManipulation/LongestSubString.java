package StringManipulation;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String subString = "";
        String laargest = "";

        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                char c = str.charAt(i);
                String s = "" + c;
                if (subString.contains(s)) {
                    if (subString.length() >= laargest.length()) {
                        laargest = subString;
                    }
                    subString = "";
                    break;
                }
                subString = subString + c;
            }
        }

        System.out.println(laargest);
        System.out.println("length: " + laargest.length());
    }
}
