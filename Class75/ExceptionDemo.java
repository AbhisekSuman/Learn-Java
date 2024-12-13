package Class75;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONNECTION ESTABLISHED");
        try {
            System.out.println("Enter 2 numbers for division: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int div = a / b;
            System.out.println("Division result is: " + div);
        } catch (Exception e) {
            System.out.println("ArithmeticException: / by Zero at line number 14");
        }
        System.out.println("CONNECTION DISCONNECTED");
    }
}
