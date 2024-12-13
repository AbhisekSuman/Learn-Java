package Class55;

import java.util.Scanner;

public class CapitalLizeFirstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        String capitalize = "";
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1);
            capitalize = capitalize + str[i] + " ";
        }
        System.out.println(capitalize);
    }
}
