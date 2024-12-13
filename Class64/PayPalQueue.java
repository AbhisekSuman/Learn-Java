package Class64;

import java.util.Scanner;

public class PayPalQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Queue Size");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);
        CircularQueue circularQueue = new CircularQueue(size);

        System.out.println("Press 1 for Queue");
        System.out.println("Press 2 for Circular Queue");
        switch (scanner.nextInt()) {
            case 1:
                while (true) {
                    System.out.println("Please Choose a no");
                    System.out.println("Press 1 to insert");
                    System.out.println("Press 2 to delete");
                    System.out.println("Press 3 to display");
                    System.out.println("Press any to Exit");

                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Enter element to Insert");
                            queue.insert(scanner.nextInt());
                            break;
                        case 2:
                            queue.delete();
                            break;
                        case 3:
                            queue.display();
                            break;
                        default:
                            System.out.println("Thank you for using us....");
                            return;
                    }
                }
            case 2:
                while (true) {
                    System.out.println("Please Choose a no");
                    System.out.println("Press 1 to insert");
                    System.out.println("Press 2 to delete");
                    System.out.println("Press 3 to display");
                    System.out.println("Press any to Exit");

                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Enter element to Insert");
                            circularQueue.insert(scanner.nextInt());
                            break;
                        case 2:
                            circularQueue.delete();
                            break;
                        case 3:
                            circularQueue.display();
                            break;
                        default:
                            System.out.println("Thank you for using us....");
                            return;
                    }
                }
        }
    }
}
