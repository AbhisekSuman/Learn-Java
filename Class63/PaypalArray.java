package Class63;

import java.util.Arrays;
import java.util.Scanner;

public class PaypalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        Array array = new Array(scanner.nextInt());


        while (true) {
            System.out.println("CHOOSE AN OPTION");
            System.out.println("Press 1 to INSERT");
            System.out.println("Press 2 to DELETE");
            System.out.println("Press 3 to DISPLAY");
            System.out.println("Press 4 to get an element");
            System.out.println("Any other no to STOP");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter element and position to insert");
                    array.insert(scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the position to delete the element");
                    array.delete(scanner.nextInt());
                    break;
                case 3:
                    array.display();
                    break;
                case 4:
                    System.out.println("Enter position to find element: ");
                    int pos = scanner.nextInt();
                    System.out.println("Element at index " + pos + " is " + array.get(pos));
                    break;
                default:
                    System.out.println("Thank you....");
                    return;
            }
        }

    }
}
