package StringManipulation;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int position = scanner.nextInt();
        String direction = scanner.next();

        String res;

        switch (direction) {
            case "left":
                res = str.substring(position) + str.substring(0,position);
                System.out.println("Rotated String: " + res);
                break;
            case "right":
                int right = str.length() - position;
                res = str.substring(right) + str.substring(0, right);
                System.out.println("Rotated String: " + res);
                break;
        }

    }
}
