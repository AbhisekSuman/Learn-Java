package Class55;

import java.util.Scanner;

public class DigitsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                str = str + ch;
            }
        }
        System.out.println(str);
    }
}
