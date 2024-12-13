package Class48;

import java.util.Scanner;

public class BankArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] customer = new String[10];

        for (int i = 0; i < customer.length; i++) {

            System.out.println("Enter " + (i + 1) + " th customer's name: ");
            customer[i] = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < customer.length; i++) {
            if (i == customer.length - 1) {
                System.out.print(customer[i]);
                break;
            }
            System.out.print(customer[i] + ", ");
        }
        System.out.print(" ]");
    }
}
