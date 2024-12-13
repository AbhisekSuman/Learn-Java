package Class63;

import java.util.Scanner;

public class PaypalStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Stack Size: ");
        Stack stack = new Stack(scanner.nextInt());


        while (true) {
            System.out.println("CHOOSE AN OPTION");
            System.out.println("Press 1 to PUSH");
            System.out.println("Press 2 to POP");
            System.out.println("Press 3 to DISPLAY");
            System.out.println("Any other no to STOP");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter element");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    System.out.println("Thank you....");
                    return;
            }
        }
    }
}
