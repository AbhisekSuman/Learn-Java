package Class65;

import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList linkedList = new SingleLinkedList();

        while (true) {
            System.out.println("Press 1 for insertion at rear");
            System.out.println("Press 2 for insertion at front");
            System.out.println("Press 3 for deletion at rear");
            System.out.println("Press 4 for insertion at Front");
            System.out.println("Press 5 for display");
            System.out.println("Press 6 for display reverse");
            System.out.println("Enter any to exit.");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter Element: ");
                    linkedList.insertionRear(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Element: ");
                    linkedList.insertionFront(scanner.nextInt());
                    break;
                case 3:
                    linkedList.deleteRear();
                    break;
                case 4:
                    linkedList.deleteFront();
                    break;
                case 5:
                    linkedList.displayForward();
                    break;
                case 6:
//                    linkedList.deisplayBackWord();
                    break;
                default:
                    System.out.println("Thank You....");
                    return;
            }
        }
    }
}
