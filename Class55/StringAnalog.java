package Class55;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        boolean flag = true;
        if (s1.length() != s2.length()) {
            flag = false;
        }
        else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("Are the strings anagrams? " + flag);
    }
}
